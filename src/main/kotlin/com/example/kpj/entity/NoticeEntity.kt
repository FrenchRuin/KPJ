package com.example.kpj.entity

import jakarta.persistence.*
import java.time.LocalDateTime

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
    var createdTime: LocalDateTime = LocalDateTime.now()

    @Column
    var updatedTime: LocalDateTime? = null
}