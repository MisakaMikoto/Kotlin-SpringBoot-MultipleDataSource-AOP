package com.wemakeprice.unusedticket.restapi.admin.mapper

import com.wemakeprice.unusedticket.restapi.admin.dto.Admin
import com.wemakeprice.unusedticket.restapi.config.database.mapper.MasterMapper
import org.springframework.stereotype.Repository

@Repository
@MasterMapper
interface AdminMasterMapper {
    val example: List<Admin>
}
