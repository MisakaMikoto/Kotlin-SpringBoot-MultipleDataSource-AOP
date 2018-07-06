package com.misakamikoto.springboot.restapi.aspect.pointcut

import org.aspectj.lang.annotation.Pointcut

class RestExceptionPointcut {
    @Pointcut("execution(* com.misakamikoto.springboot.api..*(..))")
    fun exception() {
    }
}
