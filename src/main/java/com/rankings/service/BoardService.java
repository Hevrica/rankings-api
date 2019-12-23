package com.rankings.service;

import java.util.List;

import com.rankings.domain.BoardCommentVO;
import com.rankings.domain.BoardVO;

public interface BoardService {
	public boolean insertBoard(BoardVO boardVO);
	public List<BoardVO> getBoardList();
	public boolean modifyBoard(BoardVO boardVO);
	public boolean removeBoard(int board_id);
	
	public boolean insertBoardComment(BoardCommentVO boardCommentVO);
	public List<BoardCommentVO> getBoardCommentList();
	public boolean modifyBoardComment(BoardCommentVO boardCommentVO);
	public boolean removeBoardComment(int Comment_id);
	
	public List<BoardVO> getAllList(int board_id);
}