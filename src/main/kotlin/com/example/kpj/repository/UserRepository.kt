package com.example.kpj.repository

import com.example.kpj.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional
import javax.print.attribute.standard.RequestingUserName

@Repository
interface UserRepository : JpaRepository<UserEntity,Long> {

    fun findByUserName(userName : String) : UserEntity?
}