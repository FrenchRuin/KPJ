package com.example.kpj.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class MainController {

    @GetMapping("/test")
    fun home(): String {
        return "test"
    }

    @GetMapping("/charts")
    fun charts(): String {
        return "charts"
    }

    @GetMapping("/animation")
    fun animation() : String{
        return "utilities-animation"
    }

    @GetMapping("/border")
    fun border() : String{
        return "utilities-border"
    }

    @GetMapping("/other")
    fun other() : String{
        return "utilities-other"
    }

    @GetMapping("/blank")
    fun blank(): String {
        return "blank"
    }

    @GetMapping("/cards")
    fun cards(): String {
        return "cards"
    }

    @GetMapping("/buttons")
    fun buttons(): String {
        return "buttons"
    }

    @GetMapping("/calendar")
    fun calendar(): String {
        return "/calendar/calendar"
    }

    @GetMapping("/colors")
    fun colors(): String {
        return "utilities-color"
    }


}