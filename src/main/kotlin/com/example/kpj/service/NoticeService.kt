package com.example.kpj.service

import com.example.kpj.entity.NoticeEntity
import com.example.kpj.entity.UserEntity
import com.example.kpj.repository.NoticeRepository
import com.example.kpj.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class NoticeService {

    @Autowired
    private lateinit var noticeRepository: NoticeRepository

    @Autowired
    private lateinit var userRepository: UserRepository

    /* 공지사항 저장 메소드 */
    fun saveNotice(noticeEntity: NoticeEntity, userName: String) {
        // 새로운 유저 생성
        val newUserEntity =  UserEntity()
        newUserEntity.userName = userName
        userRepository.save(newUserEntity)

        noticeEntity.writer = newUserEntity
        noticeEntity.createdTime = LocalDateTime.now()
        noticeEntity.updatedTime = LocalDateTime.now()

        noticeRepository.save(noticeEntity)
    }

    /* 공지사항 조회 메소드 */
    fun findAllNotice(): List<NoticeEntity> {
        return noticeRepository.findAll()
    }

    fun findNoticeById(id : Long) : Optional<NoticeEntity> {
        return noticeRepository.findById(id)
    }

}