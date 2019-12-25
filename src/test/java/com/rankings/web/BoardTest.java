package com.rankings.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rankings.mapper.BoardMapper;
import com.rankings.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardTest {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;

	@Setter(onMethod_ = @Autowired)
	private BoardService boardService;

//	@Test
//	public void boardTest_Create() {
//		BoardVO board = new BoardVO();
//		board.setBoard_writer("테스터");
//		board.setBoard_pwd("12345");
//		board.setBoard_title("테스트 제목");
//		board.setBoard_content("테스트 내용");
//		board.setBoard_image("테스트 이미지");
//		board.setUser_id(1);
//
//		log.info("boardTest_Create : " + board);
//		boolean create = boardMapper.create_board(board);
//		if (create) {
//			log.info("Create Success");
//		}
//	}
//
	@Test
	public void boardTest_ReadList() {
		boardService.getBoardList().forEach(board -> log.info(board));
	}
//
//	@Test
//	public void boardTest_Update() {
//		BoardVO board = new BoardVO();
//		board.setBoard_id(2);
//		board.setBoard_writer("수정 테스터");
//		board.setBoard_pwd("67890");
//		board.setBoard_title("수정 테스트 제목");
//		board.setBoard_content("수정 테스트 내용");
//		board.setBoard_image("수정 테스트 이미지");
//
//		log.info("boardTest_Update : " + board);
//		boolean update = boardMapper.update_board(board);
//		if (update) {
//			log.info("Update Success");
//		}
//	}
//
//	@Test
//	public void boardTest_Delete() {
//		boolean delete = boardMapper.delete_board(1);
//		if (delete) {
//			log.info("Delete Success");
//		}
//	}
//
//	@Test
//	public void boardCommentTest_Create() {
//		BoardCommentVO boardComment = new BoardCommentVO();
//		boardComment.setComment_writer("댓글 테스터");
//		boardComment.setComment_pwd("12345");
//		boardComment.setComment_content("댓글 테스트");
//		boardComment.setUser_id(1);
//		boardComment.setBoard_id(1);
//
//		log.info("boardTest_Create : " + boardComment);
//		boolean create = boardMapper.create_boardComment(boardComment);
//		if (create) {
//			log.info("Create Success");
//		}
//	}
//
//	@Test
//	public void boardCommentTest_ReadList() {
//		boardService.getBoardCommentList().forEach(board -> log.info(board));
//	}
//
//	@Test
//	public void boardCommentTest_Update() {
//		BoardCommentVO boardComment = new BoardCommentVO();
//		boardComment.setComment_id(1);
//		boardComment.setComment_writer("수정 댓글 테스터");
//		boardComment.setComment_pwd("67890");
//		boardComment.setComment_content("수정 댓글 테스트");
//
//		log.info("boardTest_Update : " + boardComment);
//		boolean create = boardMapper.update_boardComment(boardComment);
//		if (create) {
//			log.info("Update Success");
//		}
//	}
//
//	@Test
//	public void boardCommentTest_Delete() {
//		boolean delete = boardMapper.delete_boardComment(1);
//		if (delete) {
//			log.info("Delete Success");
//		}
//	}
}