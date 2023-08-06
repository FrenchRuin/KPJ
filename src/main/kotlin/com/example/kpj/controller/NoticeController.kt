package com.example.kpj.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/notice")
class NoticeController {

    @GetMapping("/")
    fun notice(): String {
        return "/notice/notice"
    }

}