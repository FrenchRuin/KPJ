package com.example.kpj.controller

import com.example.kpj.entity.NoticeEntity
import com.example.kpj.service.NoticeService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping


/*INFO 부분 컨트롤러
*
* Notice
* Dev_info
*
* */
@Controller
@RequestMapping("/info")
@Slf4j
class InfoController {

    @Autowired(required = false)
    private lateinit var noticeService: NoticeService

    /*Notice Part*/
    @GetMapping("/notice")
    fun notice(model: Model, noticeEntity: NoticeEntity): String {
        model.addAttribute("NoticeEntity", noticeService.findAllNotice())
        return "/info/notice"
    }

    @PostMapping("/notice/apply")
    fun noticeApply(noticeEntity: NoticeEntity, userName : String): String {
        noticeService.saveNotice(noticeEntity, userName)
        return "redirect:/info/notice"
    }

    /*Dev_Info Part*/
    @GetMapping("/devInfo")
    fun devInfo(): String {
        return "/info/devInfo"
    }

}