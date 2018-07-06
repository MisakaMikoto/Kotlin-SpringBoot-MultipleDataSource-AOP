package com.misakamikoto.springboot.restapi.config.database.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "spring.slave.datasource")
class SlaveDataSourceProperties : DataSourceProperties()
