# Spring-AOP
This repository contains my learning journey for **Spring AOP**. It includes the code examples, exercises, and notes that I followed while studying the course.  

## What you'll find here
- Example projects and code snippets from the Spring AOP course that demonstrates basic **Aspect-Oriented Programming** in Spring..
- @Transactional example using (`@Before`, `@AfterReturning`, `@AfterThrowing`, `@After`).
- Custom **Around advice** to manage method execution.
- Shows how Spring handles **transactions manually** using `@Around`.

# Purpose
The purpose of this repository is to track my progress and serve as a personal reference while learning Spring AOP.  

## some of pointcuts in this project

- execution(public String getAllPosts()) //body of func
- execution(String getAllPosts()) //public is not a must
- execution(String com.spring.dao.PostService.getAllPosts()) // full path
- execution(void getAllPosts()) //u can determine the return type
- execution(* getAllPosts()) //any return type for a method called getAllPosts()
- execution(* getAll*()) //any return type for method called getAllblablaanything()
- execution(* getAll*(com.spring.model.User)) // giving full path of parameter is a must if there is a parameter
- execution(* getAll*(com.spring.model.User,..)) // second parameter is any parameter or no more params
- execution(* getAll*(..)) // any param or zero params
- execution(* com.spring.dao.*.*(..)) //any class in com.spring.dao and any mehod in it which have any params

[

@Pointcut("execution(* com.spring.dao.*.*(..))")
public void myPointCut() {}

@Pointcut("execution(* com.spring.dao.*.set*())")
public void setterPointCut() {}
	
@Pointcut("execution(* com.spring.dao.*.get*())")
public void getterPointCut() {}

"myPointCut()&&!(setterPointCut()||getterPointCut())"

]

## Important Annotations

- @EnableAspectJAutoProxy
- @Aspect
- @Order
- @Before
- @AfterReturning
- @AfterThrowing
- @After
- @Pointcut
- @Around

