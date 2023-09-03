package com.example.kpj.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class UserEntity {

    @Id
    @GeneratedValue
    var id: Long? = null

    @Column
    var userName: String? = null

}