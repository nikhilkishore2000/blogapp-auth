package com.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer> {

}