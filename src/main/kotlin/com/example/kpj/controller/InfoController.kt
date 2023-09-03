package com.example.kpj.controller

import com.example.kpj.entity.NoticeEntity
import com.example.kpj.repository.NoticeRepository
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
class InfoController {

    @Autowired
    private lateinit var noticeRepository: NoticeRepository

    /*Notice Part*/
    @GetMapping("/notice")
    fun notice(model: Model, noticeEntity: NoticeEntity): String {
        model.addAttribute("NoticeEntity",noticeRepository.findAll())
        return "/info/notice"
    }

    @PostMapping("/notice/apply")
    fun noticeApply(noticeEntity: NoticeEntity): String {
        noticeRepository.save(noticeEntity)
        return "redirect:/info/notice"
    }

    /*Dev_Info Part*/
    @GetMapping("/devInfo")
    fun devInfo(): String {

        return "/info/devInfo"
    }

}