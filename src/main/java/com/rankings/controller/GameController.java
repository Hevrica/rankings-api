package com.rankings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rankings.domain.GameVO;
import com.rankings.service.GameService;

import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@Api(value = "swag-rest-controller", description = "grank")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/onlinelist", produces = "application/json; charset=UTF-8")
	public List<GameVO> getOnlineList() throws Exception {
		List<GameVO> onlineList = gameService.getOnlineList();
		log.info("getOnlineList : " + onlineList);
		return onlineList;
	}
	
	@GetMapping(value = "/mobilelist", produces = "application/json; charset=UTF-8")
	public List<GameVO> getMobileList() throws Exception {
		List<GameVO> mobileList = gameService.getMobileList();
		log.info("getMobileList : " + mobileList);
		return mobileList;
	}
}