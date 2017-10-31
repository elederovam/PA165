package cz.muni.fi.pa165;

import javax.inject.Named;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author Marketa Elederova
 */
@Named
@Aspect
public class LoggingAspect {

    @Around("execution(public * *(..))")
    public Object logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {

        Long startTime = System.nanoTime();
        Object result = joinPoint.proceed();
        Long endTime = System.nanoTime();
        Long durationTime = endTime - startTime;

        System.out.println("Duration of method "
                + joinPoint.getSignature() + ": "
                + durationTime + " ns");

        return result;
    }
}
