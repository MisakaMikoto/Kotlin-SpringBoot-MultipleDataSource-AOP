package com.misakamikoto.springboot.restapi.biz.service

import com.misakamikoto.springboot.restapi.biz.mapper.BizMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BizService {

    @Autowired
    lateinit var bizMapper: BizMapper
}
