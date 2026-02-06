//package com.spring.aop;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class Database {
//
//	@Pointcut("execution(* com.spring.dao.*.*(..))")
//	public void myPointCut() {
//	}
//
//	@Pointcut("execution(* com.spring.dao.*.set*(..))")
//	public void doSetter() {
//	}
//
//	@Pointcut("execution(* com.spring.dao.*.get*(..))")
//	public void doGetter() {
//	}
//
//	
//	@Before("myPointCut()&&!(doSetter()||doGetter())")
//	public void checkDBConnection() {
//		System.out.println("connected");
//	}
//
//}
