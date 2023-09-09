package com.example.kpj.dto

import com.example.kpj.entity.UserEntity

data class NoticeDto(
    val id: Long? = null,
    val title: String? = null,
    val contents: String? = null,
    val writer: UserEntity? = null,
    val createdTime: String? = null,
    val updatedTime: String? = null
)


