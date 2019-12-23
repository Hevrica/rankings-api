package com.rankings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rankings.domain.BoardCommentVO;
import com.rankings.domain.BoardVO;
import com.rankings.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class BoardServiceImpl implements BoardService {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;

	@Override
	public boolean insertBoard(BoardVO boardVO) {
		log.info("insertBoard : " + boardVO);
		return boardMapper.create_board(boardVO);
	}

	@Override
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = boardMapper.read_board();
		log.info("getBoardList : " + boardList);
		return boardList;
	}

	@Override
	public boolean modifyBoard(BoardVO boardVO) {
		log.info("modifyBoard : " + boardVO);
		return boardMapper.update_board(boardVO);
	}

	@Override
	public boolean removeBoard(int board_id) {
		log.info("removeBoard : " + board_id);
		return boardMapper.delete_board(board_id);
	}

	@Override
	public boolean insertBoardComment(BoardCommentVO boardCommentVO) {
		log.info("insertBoardComment : " + boardCommentVO);
		return boardMapper.create_boardComment(boardCommentVO);
	}

	@Override
	public List<BoardCommentVO> getBoardCommentList() {
		List<BoardCommentVO> boardCommentList = boardMapper.read_boardComment();
		log.info("getBoardCommentList : " + boardCommentList);
		return boardCommentList;
	}

	@Override
	public boolean modifyBoardComment(BoardCommentVO boardCommentVO) {
		log.info("modyfiBoardComment : " + boardCommentVO);
		return boardMapper.update_boardComment(boardCommentVO);
	}

	@Override
	public boolean removeBoardComment(int Comment_id) {
		log.info("removeBoardComment : " + Comment_id);
		return boardMapper.delete_boardComment(Comment_id);
	}

	@Override
	public List<BoardVO> getAllList(int board_id) {
		List<BoardVO> boardAllList = boardMapper.read_all(board_id);
		log.info("getAllList : " + boardAllList);
		return boardAllList;
	}
}