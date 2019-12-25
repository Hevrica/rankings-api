package com.rankings.mapper;

import java.util.List;

import com.rankings.domain.BoardCommentVO;
import com.rankings.domain.BoardVO;

public interface BoardMapper {
	// Board Schema : 커뮤니티 게시판 게시글 CRUD
	public boolean create_board(BoardVO boardVO);
	public List<BoardVO> read_board();
	public boolean update_board(BoardVO boardVO);
	public boolean delete_board(int id);
	
	// Board_Comment Schema : 커뮤니티 게시판 댓글 CRUD
	public boolean create_boardComment(BoardCommentVO boardCommentVO);
	public List<BoardCommentVO> read_boardComment();
	public boolean update_boardComment(BoardCommentVO boardCommentVO);
	public boolean delete_boardComment(int id);
}