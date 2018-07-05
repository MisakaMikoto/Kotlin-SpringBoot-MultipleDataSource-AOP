package com.wemakeprice.unusedticket.restapi.admin.controller

import com.wemakeprice.unusedticket.restapi.admin.dto.Admin
import com.wemakeprice.unusedticket.restapi.admin.service.AdminService
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiImplicitParams
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class AdminController {

    @Autowired
    lateinit var adminService: AdminService


    @GetMapping("/admin/master/get")
    fun getMaster(): List<Admin> {
        return adminService.getMaster()
    }

    @ApiOperation(value = "swagger Get parameter example")
    @ApiImplicitParams(ApiImplicitParam(name = "id", value = "User's id", required = true, dataType = "String"), ApiImplicitParam(name = "name", value = "User's name", required = true, dataType = "String"))
    @GetMapping("/admin/master/get/param")
    fun getMasterWithParameter(@ApiParam @RequestParam("id") id: String, @RequestParam("name") name: String): List<Admin> {
        return adminService.getMaster()
    }

    @PutMapping("/admin/master/put")
    fun putMaster(): List<Admin> {
        return adminService.getMaster()
    }

    @PutMapping("/admin/slave/put")
    fun putSlave(): List<Admin> {
        return adminService.getSlave()
    }

    @PostMapping("/admin/master/post")
    fun postMaster(): List<Admin> {
        return adminService.getMaster()
    }

    @PostMapping("/admin/slave/post")
    fun postSlave(): List<Admin> {
        return adminService.getSlave()
    }

    @DeleteMapping("/admin/master/delete")
    fun deleteMaster(): List<Admin> {
        return adminService.getMaster()
    }

    @DeleteMapping("/admin/slave/delete")
    fun deleteSlave(): List<Admin> {
        return adminService.getSlave()
    }
}
