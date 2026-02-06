package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.User;

@Component("post")
public class PostDaoImpl implements PostDao {

	@Override
	public void getAllPosts(User user) {
		//return "My posts ... PostDAo";
		System.out.println("My posts ... PostDAo");
	}

	@Override
	public void getAllLikes() {
		System.out.println("PostDao ... Likes");
	}

	@Override
	public String setStr() {
		return "str setpost";
	}

	@Override
	public String getStr() {
		return "str getpost";

	}

}
