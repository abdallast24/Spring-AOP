package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringConfig;
import com.spring.dao.DBAccess;
import com.spring.dao.PostDao;
import com.spring.dao.PostService;

public class Main {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//
//		PostDao postDAO = context.getBean("post", PostDao.class);
//		postDAO.getAllPosts(new User());
//		System.out.println("--------------------");
//		postDAO.getAllLikes();
//		System.out.println("--------------------");
//
//		System.out.println(postDAO.setStr());
//		System.out.println("--------------------");
//
//		System.out.println(postDAO.getStr());
//		System.out.println("--------------------");
//
//		PostService postService = context.getBean("service", PostService.class);
//		System.out.println(postService.getAllPosts() + "\n---------------");
//		System.out.println(postService.getAllLikes());
//		System.out.println("--------------------");
//
//		System.out.println(postService.setStr());
//		System.out.println("--------------------");
//
//		System.out.println(postService.getStr());
//		System.out.println("--------------------");

		DBAccess access = context.getBean("access",DBAccess.class);
		System.out.println(access.returnDBDate());
		context.close();
	}
}
