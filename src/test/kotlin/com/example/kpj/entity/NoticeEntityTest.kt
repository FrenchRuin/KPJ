package com.example.kpj.entity

import com.example.kpj.repository.NoticeRepository
import com.example.kpj.repository.UserRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class NoticeEntityTest {

    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var noticeRepository: NoticeRepository

    /*코틀린 객체 테스트..
    *
    * TestUser 생성후, TestNotice 생성 시험
    *
    * */
    @Test
    fun test1() {
        val user = UserEntity()
        user.userName = "ljc"

        userRepository.save(user)

        val notice = NoticeEntity()
        notice.title = "test"
        notice.writer = user
        notice.contents = "Test Contents"

        noticeRepository.save(notice)

        val notice1  = noticeRepository.findById(1)

        println(notice1.get().title)
    }
}