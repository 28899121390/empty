package com.baizhi.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * Created by skl on 2018/6/12.
 */
@Configuration
@Aspect
public class AdminProxy {

   @Around("@annotation(com.baizhi.annotation.LogAnnotation)")
    public void around(ProceedingJoinPoint joinPoint) {
       System.out.println("环绕通知之前");
       try {
           Object proceed = joinPoint.proceed();
           //获取参数数组
           Object[] args = joinPoint.getArgs();
           //获取代理类对象target:adminServiceImpl
           Object target = joinPoint.getTarget();
           //获取代理类对象
           Object aThis = joinPoint.getThis();
           joinPoint.getSignature();
           //获取目标方法名name:modfiy
           String name = joinPoint.getSignature().getName();
           //获取目标对象method:xxxxmodfiy(admin)
           MethodSignature signature = (MethodSignature) joinPoint.getSignature();
           Method method = signature.getMethod();
           System.out.println("环绕通知之后");
       } catch (Throwable throwable) {
           throwable.printStackTrace();
       }
   }
}
