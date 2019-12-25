package com.rankings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rankings.domain.BoardCommentVO;
import com.rankings.domain.BoardVO;
import com.rankings.service.BoardService;

import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/board/*")
@Api(value = "swag-rest-controller", description = "grank")
public class BoardController {
	// 공부할 것 : ResponseEntity, @PathVariable, @RequestBody
	@Autowired
	private BoardService boardService;

	@PostMapping(value = "/new", consumes = "application/json", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> insertBoard(@RequestBody BoardVO boardVO) throws Exception {
		log.info("boardVO : " + boardVO);

		boolean insertBoard = boardService.insertBoard(boardVO);
		log.info("insertBoard boolean : " + insertBoard);

		return insertBoard == true ? new ResponseEntity<>("insertBoard Success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping(value = "/list", produces = { "application/json; charset=UTF-8" })
	public ResponseEntity<List<BoardVO>> getBoardList() throws Exception {
		log.info("getBoardList");
		return new ResponseEntity<>(boardService.getBoardList(), HttpStatus.OK);
	}

	@PutMapping(value = "/modify/{id}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<String> modifyBoard(@PathVariable("id") int id, @RequestBody BoardVO boardVO)
			throws Exception {
		boardVO.setId(id);
		log.info("board_id : " + id);
		log.info("modifyBoard : " + boardVO);
		return boardService.modifyBoard(boardVO) == true ? new ResponseEntity<>("modifyBoard Success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@DeleteMapping(value = "/remove/{board_id}", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> removeBoard(@PathVariable("id") int id) throws Exception {
		log.info("removeBoard : " + id);
		return boardService.removeBoard(id) == true ? new ResponseEntity<>("removeBoard Success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@PostMapping(value = "/newcomment", consumes = "application/json", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> insertBoardComment(@RequestBody BoardCommentVO boardCommentVO) throws Exception {
		log.info("boardCommentVO : " + boardCommentVO);

		boolean insertBoardComment = boardService.insertBoardComment(boardCommentVO);
		log.info("insertBoard boolean : " + insertBoardComment);

		return insertBoardComment == true ? new ResponseEntity<>("insertBoardComment Success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping(value = "/listcomment", produces = { "application/json; charset=UTF-8" })
	public ResponseEntity<List<BoardCommentVO>> getBoardCommentList() throws Exception {
		log.info("getBoardCommentList");
		return new ResponseEntity<>(boardService.getBoardCommentList(), HttpStatus.OK);
	}

	@PutMapping(value = "/modifycomment/{comment_id}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<String> modifyBoard(@PathVariable("id") int id, @RequestBody BoardCommentVO boardCommentVO)
			throws Exception {
		boardCommentVO.setId(id);
		log.info("comment_id : " + id);
		log.info("modifyBoardComment : " + boardCommentVO);
		return boardService.modifyBoardComment(boardCommentVO) == true
				? new ResponseEntity<>("modifyBoardComment Success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@DeleteMapping(value = "/removecomment/{comment_id}/{comment_pwd}", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> removeBoardComment(@PathVariable("id") int id) throws Exception {
		log.info("removeBoardComment : " + id);
		return boardService.removeBoardComment(id) == true
				? new ResponseEntity<>("removeBoardComment Success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}