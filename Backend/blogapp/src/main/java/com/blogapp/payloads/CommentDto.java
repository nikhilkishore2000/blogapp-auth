package com.blogapp.payloads;

import com.blogapp.entity.Post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {
	
	private int id;
	
	private String content;


}
