package com.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entities.Comment;

public interface ComentRepo extends JpaRepository<Comment, Integer>{
	
}
