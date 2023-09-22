package com.example.kpj.entity

import jakarta.persistence.*

@Entity
class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column
    var userName: String? = null
) {
    /*ToString Override*/
    override fun toString(): String {
        return "UserEntity(id = $id, userName = $userName)"
    }
}