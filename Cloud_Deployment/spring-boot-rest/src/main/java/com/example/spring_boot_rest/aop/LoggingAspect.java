package com.example.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

//    return type class_name.method_name(args)

    @Before("execution(* com.example.spring_boot_rest.service.*.*(..))  || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")        //advice(pointcut)
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called {} ", jp.getSignature().getName());
    }

    @After("execution(* com.example.spring_boot_rest.service.*.*(..))  || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")        //advice(pointcut)
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method executed {} ", jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.example.spring_boot_rest.service.*.*(..))  || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")        //advice(pointcut)
    public void logMethodCrashed(JoinPoint jp){
        LOGGER.info("Method has some issues {} ", jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.spring_boot_rest.service.*.*(..))  || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")        //advice(pointcut)
    public void logMethodSuccess(JoinPoint jp){
        LOGGER.info("Method successfully executed {} ", jp.getSignature().getName());
    }
}
