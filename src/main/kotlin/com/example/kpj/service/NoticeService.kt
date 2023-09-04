package com.example.kpj.service

import com.example.kpj.entity.NoticeEntity
import com.example.kpj.repository.NoticeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class NoticeService {

    @Autowired
    private lateinit var noticeRepository: NoticeRepository

    /* 공지사항 저장 메소드 */
    fun saveNotice(noticeEntity: NoticeEntity) {
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