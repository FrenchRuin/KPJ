package com.example.kpj.dto

import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class NoticeDto(
    val id: Long? = null,
    val title: String? = null,
    val contents: String? = null,
    var writer: UserDto? = null,
    var createdTime: String? = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
    val updatedTime: String? = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
)


