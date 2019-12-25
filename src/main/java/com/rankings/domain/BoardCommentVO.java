package com.rankings.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardCommentVO {
	private int id;
	private String writer;
	private String pwd;
	private String content;
	private Date create_date;
	private Date update_date;
	private int user_id;
	private int board_id;
}