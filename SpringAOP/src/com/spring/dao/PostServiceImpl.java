package com.spring.dao;

import org.springframework.stereotype.Component;

@Component("service")
public class PostServiceImpl implements PostService {

	@Override
	public String getAllPosts() {
		return "My posts ... postService";
	}

	@Override
	public String getAllLikes() {
		return "PostService .. Likes";
	}

	@Override
	public String setStr() {
		return "str setservice";
	}

	@Override
	public String getStr() {
		return "str getservice";

	}

}
