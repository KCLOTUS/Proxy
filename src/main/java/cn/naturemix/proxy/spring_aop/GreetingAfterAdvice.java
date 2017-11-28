package cn.naturemix.proxy.spring_aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author flytoyou
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object  result, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After");
    }
}
