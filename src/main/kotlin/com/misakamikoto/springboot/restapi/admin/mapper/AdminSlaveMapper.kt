package com.misakamikoto.springboot.restapi.admin.mapper

import com.misakamikoto.springboot.restapi.admin.dto.Admin
import com.misakamikoto.springboot.restapi.config.database.mapper.SlaveMapper
import org.springframework.stereotype.Repository

@Repository
@SlaveMapper
interface AdminSlaveMapper {
    val example: List<Admin>
}
