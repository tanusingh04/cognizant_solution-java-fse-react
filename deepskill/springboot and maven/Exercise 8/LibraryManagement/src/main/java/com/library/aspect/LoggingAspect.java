package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.*(..)) || execution(* com.library.repository.BookRepository.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[AOP-BEFORE] Starting execution of: " + joinPoint.getSignature().toShortString());
    }

    @After("execution(* com.library.service.BookService.*(..)) || execution(* com.library.repository.BookRepository.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[AOP-AFTER] Completed execution of: " + joinPoint.getSignature().toShortString());
    }
}
