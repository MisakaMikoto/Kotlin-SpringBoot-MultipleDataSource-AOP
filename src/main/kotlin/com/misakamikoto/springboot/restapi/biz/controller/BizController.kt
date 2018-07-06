package com.misakamikoto.springboot.restapi.biz.controller

import com.misakamikoto.springboot.restapi.biz.service.BizService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BizController {

    @Autowired
    lateinit var bizService: BizService

    @GetMapping("/biz/get")
    fun biz(): String {
        return "biz"
    }
}
