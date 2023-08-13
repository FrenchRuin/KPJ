package com.example.kpj.entity

import jakarta.persistence.*

@Entity
class NoticeEntity {

    @Id
    @GeneratedValue
    var id : Long? = null

}