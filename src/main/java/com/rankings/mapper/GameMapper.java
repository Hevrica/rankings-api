package com.rankings.mapper;

import java.util.List;

import com.rankings.domain.GameVO;

public interface GameMapper {
	public List<GameVO> read_onlineList(String g_month);
	public List<GameVO> read_mobileList(String g_week);
}