package com.example.kpj.controller

import com.example.kpj.entity.NoticeEntity
import com.example.kpj.service.NoticeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/service")
class ServiceController {

    @Autowired(required = false)
    private lateinit var noticeService: NoticeService

    /*
     *
     * Hospital part
     * */
    @GetMapping("/hospital")
    fun scheduler(): String {
        return "/service/hospital"
    }

    /*
    *
    * Notice Part
    * */
    @GetMapping("/notice")
    fun notice(model: Model, noticeEntity: NoticeEntity): String {
        model.addAttribute("NoticeEntity", noticeService.findAllNotice())
        return "/service/notice"
    }

    @PostMapping("/notice/apply")
    fun noticeApply(noticeEntity: NoticeEntity, userName: String): String {
        noticeService.saveNotice(noticeEntity, userName)
        return "redirect:/service/notice"
    }

    @RequestMapping("/notice/find")
    @ResponseBody
    fun getNotice(@RequestParam("id") id: Long) = noticeService.findNoticeById(id)

}