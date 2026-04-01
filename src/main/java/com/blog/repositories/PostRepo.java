package com.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entities.Category;
import com.blog.entities.Post;
import com.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	//Need the post of a user syntax findByName it is a custom finder method
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	//Here Title is field name we can replace it as per our requirement from where we want to search
	List<Post> findByTitleContaining(String title);
}
