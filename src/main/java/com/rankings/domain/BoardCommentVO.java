package com.rankings.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BoardCommentVO {
	private int id;
	private String writer;
	private String pwd;
	private String content;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date create_at;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date update_at;
	
	private int user_id;
	private int board_id;
}