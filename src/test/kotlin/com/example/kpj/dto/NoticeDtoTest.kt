package com.example.kpj.dto

import com.example.kpj.entity.NoticeEntity
import com.example.kpj.logger
import com.example.kpj.repository.NoticeRepository
import groovy.util.logging.Slf4j
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Slf4j
internal class NoticeDtoTest {

    @Autowired
    private lateinit var noticeRepository: NoticeRepository

    @Autowired
    private lateinit var modelMapper: ModelMapper

    val log = logger()


    @Test
    fun test1() {
        var noticeDto = NoticeDto(
            1,
            "테스트용",
            "테스트용도입니다.",
        )

        var noticeEntity = modelMapper.map(noticeDto, NoticeEntity::class.java)
        noticeRepository.save(noticeEntity)
        var nowEntity = noticeRepository.findAll()
    }
}