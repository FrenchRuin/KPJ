package com.example.kpj.entity

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Entity
class NoticeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null;

    @Column
    var title: String? = null

    @Column
    var contents: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    var writer: UserEntity? = null

    @Column
    @CreatedDate
    var createdTime: String? = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

    @Column
    @LastModifiedDate
    var updatedTime: String? = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
}