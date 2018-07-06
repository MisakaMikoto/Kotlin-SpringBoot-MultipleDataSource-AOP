package com.misakamikoto.springboot.restapi.admin.service

import com.misakamikoto.springboot.restapi.admin.dto.Admin
import com.misakamikoto.springboot.restapi.admin.mapper.AdminMasterMapper
import com.misakamikoto.springboot.restapi.admin.mapper.AdminSlaveMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class AdminService {

    @Autowired
    lateinit var adminMasterMapper: AdminMasterMapper

    @Autowired
    lateinit var adminSlaveMapper: AdminSlaveMapper

    fun getMaster(): String {
        return "master"
    }

    fun getSlave(): String {
        return "slave"
    }
}
