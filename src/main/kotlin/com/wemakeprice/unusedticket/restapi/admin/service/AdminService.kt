package com.wemakeprice.unusedticket.restapi.admin.service

import com.wemakeprice.unusedticket.restapi.admin.dto.Admin
import com.wemakeprice.unusedticket.restapi.admin.mapper.AdminMasterMapper
import com.wemakeprice.unusedticket.restapi.admin.mapper.AdminSlaveMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AdminService {

    @Autowired
    lateinit var adminMasterMapper: AdminMasterMapper

    @Autowired
    lateinit var adminSlaveMapper: AdminSlaveMapper

    fun getMaster(): List<Admin> {
        return this.adminMasterMapper.example
    }

    fun getSlave(): List<Admin> {
        return this.adminSlaveMapper.example
    }
}
