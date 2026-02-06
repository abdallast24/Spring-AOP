package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DatabaseAspect {

	@Pointcut("execution(public String getStudent())")
	public void doPointCut() {
	}

	@Before("doPointCut()")
	public void beginTransaction() {
		System.out.println("Start transaction ....");
	}

	@AfterReturning(pointcut = "doPointCut())", returning = "result")
	public void commitTransaction(Object result) {
		System.out.println("Commit transaction ...." + " from commit method -> " + result);
	}

	@AfterThrowing("doPointCut()")
	public void rollbackTransaction() {
		System.out.println("Rolling back ... ");
	}

	@After("doPointCut())")
	public void closeResources() {
		System.out.println("Close resources");
	}

	@Around("execution(public String returnDBDate())")
	public Object around(ProceedingJoinPoint jp) {
		System.out.println("Start transaction ....");
		Object result = null;
		try {
			result = jp.proceed();
			System.out.println("Commit transaction ...." + " from commit method -> " + result);

		} catch (Throwable e) {
			System.out.println("Rolling back ... ");
		} finally {
			System.out.println("Close resources");
		}

		return result;

	}

}
