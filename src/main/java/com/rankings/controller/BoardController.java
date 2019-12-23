package com.rankings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rankings.domain.BoardVO;
import com.rankings.service.BoardService;

import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@Api(value = "swag-rest-controller", description = "grank")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping(value = "/boardlist", produces = "application/json; charset=UTF-8")
	public List<BoardVO> getBoardList() throws Exception {
		List<BoardVO> boardList = boardService.getBoardList();
		log.info("getOnlineList : " + boardList);
		return boardList;
	}
}