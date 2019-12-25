package com.rankings.service;

import java.util.List;

import com.rankings.domain.BoardCommentVO;
import com.rankings.domain.BoardVO;

public interface BoardService {
	// Board Schema : 커뮤니티 게시판 게시글 CRUD
	public boolean insertBoard(BoardVO boardVO);
	public List<BoardVO> getBoardList();
	public boolean modifyBoard(BoardVO boardVO);
	public boolean removeBoard(int id);
	
	// Board_Comment Schema : 커뮤니티 게시판 댓글 CRUD
	public boolean insertBoardComment(BoardCommentVO boardCommentVO);
	public List<BoardCommentVO> getBoardCommentList();
	public boolean modifyBoardComment(BoardCommentVO boardCommentVO);
	public boolean removeBoardComment(int id);
}