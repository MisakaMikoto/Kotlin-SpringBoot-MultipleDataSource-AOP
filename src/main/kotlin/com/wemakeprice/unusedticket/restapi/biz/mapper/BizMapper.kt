package com.wemakeprice.unusedticket.restapi.biz.mapper

import com.wemakeprice.unusedticket.restapi.biz.dto.Biz
import com.wemakeprice.unusedticket.restapi.config.database.mapper.MasterMapper
import org.springframework.stereotype.Repository

@Repository
@MasterMapper
interface BizMapper {
    val example: List<Biz>
}
