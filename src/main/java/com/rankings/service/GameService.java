package com.rankings.service;

import java.util.List;

import org.json.simple.JSONObject;

public interface GameService {
	public List<JSONObject> getOnlineList(String g_month);
	public List<JSONObject> getMobileList(String g_week);
}