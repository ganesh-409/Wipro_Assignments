package com.wipro.ganesh.userapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.app.example.controller.UserController.addUser(..))")
    public void logbeforeAddUser(JoinPoint joinPoint) {
        log.info("📌 Before calling addUser method");
        log.info("👉 Method name: {}", joinPoint.getSignature().getName());
        log.info("✅ Logging aspect triggered successfully");
    }

}
