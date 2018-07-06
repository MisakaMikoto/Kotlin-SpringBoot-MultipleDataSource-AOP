package com.misakamikoto.springboot.restapi.aspect

import org.aspectj.lang.annotation.AfterThrowing
import org.aspectj.lang.annotation.Aspect
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingControllerException {

    @AfterThrowing(pointcut = "com.misakamikoto.springboot.restapi.aspect.pointcut.RestExceptionPointcut.exception()", throwing = "exception")
    fun afterException(exception: Exception) {
        logger.info("==================== REST API CALL EXCEPTION ====================")
        logger.info("Executing Exception : $exception")
    }

    companion object {
        private val logger = LoggerFactory.getLogger(LoggingController::class.java)
    }
}
