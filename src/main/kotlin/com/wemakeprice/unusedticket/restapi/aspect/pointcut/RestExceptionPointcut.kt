package com.wemakeprice.unusedticket.restapi.aspect.pointcut

import org.aspectj.lang.annotation.Pointcut

class RestExceptionPointcut {
    @Pointcut("execution(* com.wemakeprice.unusedticket.api..*(..))")
    fun exception() {
    }
}
