package com.rankings.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class BoardVO {
	private int id;
	private String writer;
	private String pwd;
	private String title;
	private String content;
	private String image;
	private Date create_date;
	private Date update_date;
	private int user_id;
	private List<BoardCommentVO> boardCommentVO;
}