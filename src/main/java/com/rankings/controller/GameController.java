package com.rankings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rankings.domain.GameVO;
import com.rankings.service.GameService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/game/*")
@Api(value = "swag-rest-controller", description = "게임 CRUD API")
public class GameController {

	@Autowired
	private GameService gameService;

	@ApiOperation(value = "온라인 게임 리스트 API", notes = "모든 온라인 게임을 가져오는  API")
	@GetMapping(value = "/online", produces = "application/json; charset=UTF-8")
	public List<GameVO> getOnlineList() throws Exception {
		List<GameVO> onlineList = gameService.getOnlineList();
		log.info("getOnlineList : " + onlineList);
		return onlineList;
	}

	@ApiOperation(value = "모바일 게임 리스트 API", notes = "모든 모바일 게임을 가져오는 API")
	@GetMapping(value = "/mobile", produces = "application/json; charset=UTF-8")
	public List<GameVO> getMobileList() throws Exception {
		List<GameVO> mobileList = gameService.getMobileList();
		log.info("getMobileList : " + mobileList);
		return mobileList;
	}
}