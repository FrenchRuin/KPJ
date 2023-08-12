package com.example.kpj.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/info")
class InfoController {

    @GetMapping("/notice")
    fun notice(): String {
        return "/info/notice"
    }

    @GetMapping("/devInfo")
    fun devInfo() : String {
        return "/info/devInfo"
    }

}