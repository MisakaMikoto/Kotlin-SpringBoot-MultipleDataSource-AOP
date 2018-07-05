package com.wemakeprice.unusedticket.restapi.admin.mapper

import com.wemakeprice.unusedticket.restapi.admin.dto.Admin
import com.wemakeprice.unusedticket.restapi.config.database.mapper.SlaveMapper
import org.springframework.stereotype.Repository

@Repository
@SlaveMapper
interface AdminSlaveMapper {
    val example: List<Admin>
}
