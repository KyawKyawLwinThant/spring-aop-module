package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CurrencyServiceAspect {
    @Pointcut("this(org.example.service.CurrencyService)")
    public void thisPointCut(){}
    @Pointcut("target(org.example.service.CurrencyService)")
    public void targetPointCut(){}
    @Pointcut("this(org.example.service.CurrencyServiceImpl)")
    public void thisPointCutImpl(){}
    @Pointcut("target(org.example.service.CurrencyServiceImpl)")
    public void targetPointCutImpl(){}

   // @Before("targetPointCutImpl()")
    public void beforeCurrencyAdvice(JoinPoint joinPoint){
        System.out.println(
                "%s method invoked before with %s."
                        .formatted(joinPoint.getSignature().getName(),
                                Arrays.toString(joinPoint.getArgs()))

        );
    }
}
