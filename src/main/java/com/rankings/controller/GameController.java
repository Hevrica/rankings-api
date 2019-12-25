package com.rankings.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	@GetMapping(value = "/online/{g_month}", produces = "application/json; charset=UTF-8")
	public List<JSONObject> getOnlineList(@PathVariable("g_month") String g_month) throws Exception {
		log.info("getOnlineList : " + g_month);
		return gameService.getOnlineList(g_month);
	}

	@ApiOperation(value = "모바일 게임 리스트 API", notes = "모든 모바일 게임을 가져오는 API")
	@GetMapping(value = "/mobile/{g_week}", produces = "application/json; charset=UTF-8")
	public List<JSONObject> getMobileList(@PathVariable("g_week") String g_week) throws Exception {
		log.info("getMobileList : " + g_week);
		return gameService.getMobileList(g_week);
	}
}