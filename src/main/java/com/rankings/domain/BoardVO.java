package com.rankings.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class BoardVO {
	private int board_id;
	private String board_writer;
	private String board_pwd;
	private String board_title;
	private String board_content;
	private String board_image;
	private Date board_create_date;
	private Date board_update_date;
	private int user_id;
	private List<BoardCommentVO> boardCommentVo;
}