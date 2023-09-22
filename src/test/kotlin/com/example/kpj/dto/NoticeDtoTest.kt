package com.example.kpj.dto

import com.example.kpj.entity.NoticeEntity
import com.example.kpj.entity.UserEntity
import com.example.kpj.logger
import com.example.kpj.repository.NoticeRepository
import com.example.kpj.repository.UserRepository
import groovy.util.logging.Slf4j
import org.junit.jupiter.api.Test
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Slf4j
internal class NoticeDtoTest {

    @Autowired
    private lateinit var noticeRepository: NoticeRepository

    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var modelMapper: ModelMapper

    @Test
    fun `NoticeDto and UserDto Test`() { // 2023.09.23 TEST Success
        /*
        * 순서
        * 1. userDto를 통해 userEntity생성
        * 2. userEntity Repository 메소드를 통해 저장
        * 3. NoticeDto 를 통해 NoticeEntity 생성
        * 4. NoticeEntity Repository 메소드를 통해 저장
        * 5. 마지막으로 NoticeEntity와 UserEntity가 조회되는지 확인
        * */
        val log = logger()

        val userDto = UserDto(
            id = 1L,
            userName = "LJC"
        )
        val userEntity = modelMapper.map(userDto, UserEntity::class.java)
        userRepository.save(userEntity)

        // NoticeDto
        val noticeDto = NoticeDto(
            id = 1L,
            title = "테스트용",
            contents = "테스트용도입니다.",
            writer = userDto,
        )
        val noticeEntity = modelMapper.map(noticeDto, NoticeEntity::class.java)
        noticeRepository.save(noticeEntity)

        val findUser = userRepository.findById(1L)
        val findNotice = noticeRepository.findById(1L)

        log.info("{}",findUser.toString())
        log.info("{}",findNotice.toString())
    }
}