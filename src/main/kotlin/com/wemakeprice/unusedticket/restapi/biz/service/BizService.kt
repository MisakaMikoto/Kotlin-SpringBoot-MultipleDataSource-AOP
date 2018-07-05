package com.wemakeprice.unusedticket.restapi.biz.service

import com.wemakeprice.unusedticket.restapi.biz.dto.Biz
import com.wemakeprice.unusedticket.restapi.biz.mapper.BizMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BizService {

    @Autowired
    lateinit var bizMapper: BizMapper
}
