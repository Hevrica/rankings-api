package com.rankings.service;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rankings.mapper.GameMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class GameServiceImpl implements GameService {

	@Setter(onMethod_ = @Autowired)
	private GameMapper gameMapper;

	@SuppressWarnings("unchecked")
	@Override
	public List<JSONObject> getOnlineList(String g_month) {
		List<JSONObject> onlineList = new ArrayList<>();
		gameMapper.read_onlineList(g_month).forEach(game -> {
			JSONObject online = new JSONObject();
			JSONObject description = new JSONObject();
			description.put("name", game.getName());
			description.put("company", game.getCompany());
			description.put("genre", game.getGenre());
			description.put("age", game.getAge());
			description.put("link", game.getLink());
			online.put("image", game.getImage());
			online.put("g_rank", game.getG_rank());
			online.put("description", description);
			onlineList.add(online);
		});
		log.info("getOnlineList : " + onlineList);
		return onlineList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<JSONObject> getMobileList(String g_week) {
		List<JSONObject> mobileList = new ArrayList<>();
		gameMapper.read_mobileList(g_week).forEach(game -> {
			JSONObject mobile = new JSONObject();
			JSONObject description = new JSONObject();
			description.put("name", game.getName());
			description.put("company", game.getCompany());
			description.put("genre", game.getGenre());
			description.put("age", game.getAge());
			description.put("link", game.getLink());
			mobile.put("image", game.getImage());
			mobile.put("g_rank", game.getG_rank());
			mobile.put("description", description);
			mobileList.add(mobile);
		});
		log.info("getMobileList : " + mobileList);
		return mobileList;
	}
}