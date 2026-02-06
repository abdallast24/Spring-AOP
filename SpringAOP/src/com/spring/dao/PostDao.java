package com.spring.dao;

import com.spring.User;

public interface PostDao {
	public void getAllPosts(User user);
	public void getAllLikes();
	public String setStr();
	public String getStr();


}
