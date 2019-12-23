package com.rankings.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardCommentVO {
	private int comment_id;
	private String comment_writer;
	private String comment_pwd;
	private String comment_content;
	private Date comment_create_date;
	private Date comment_update_date;
	private int user_id;
	private int board_id;
}