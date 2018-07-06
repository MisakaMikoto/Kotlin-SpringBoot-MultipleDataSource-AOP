package com.misakamikoto.springboot.restapi.admin.mapper

import com.misakamikoto.springboot.restapi.admin.dto.Admin
import com.misakamikoto.springboot.restapi.config.database.mapper.MasterMapper
import org.springframework.stereotype.Repository

@Repository
@MasterMapper
interface AdminMasterMapper {
    val example: List<Admin>
}
