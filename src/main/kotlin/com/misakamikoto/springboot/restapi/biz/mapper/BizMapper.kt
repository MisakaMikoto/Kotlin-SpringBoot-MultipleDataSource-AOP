package com.misakamikoto.springboot.restapi.biz.mapper

import com.misakamikoto.springboot.restapi.biz.dto.Biz
import com.misakamikoto.springboot.restapi.config.database.mapper.MasterMapper
import org.springframework.stereotype.Repository

@Repository
@MasterMapper
interface BizMapper {
    val example: List<Biz>
}
