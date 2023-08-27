package com.example.kpj.entity

import jakarta.persistence.*
import java.util.Date

@Entity
class NoticeEntity {

    @Id
    @GeneratedValue
    var boardId : Long? = null

    @Column
    var title : String? = null

    @Column
    var contents : String? = null

    @Column
    var createdTime : Date? = null

    @Column
    var updatedTime : Date? = null

}