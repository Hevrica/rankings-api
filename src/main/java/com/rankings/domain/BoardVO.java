package com.rankings.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BoardVO {
	private int id;
	private String writer;
	private String pwd;
	private String title;
	private String content;
	private String image;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date created_at;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date updated_at;
	
	private int user_id;
	private List<BoardCommentVO> boardCommentVO;
}