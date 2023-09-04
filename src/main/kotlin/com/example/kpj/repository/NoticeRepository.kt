package com.example.kpj.repository

import com.example.kpj.entity.NoticeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NoticeRepository : JpaRepository<NoticeEntity, Long>  {
}