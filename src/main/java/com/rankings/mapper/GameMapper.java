package com.rankings.mapper;

import java.util.List;

import com.rankings.domain.GameVO;

public interface GameMapper {
	public GameVO readOnline(int game_id);
	public List<GameVO> readOnlineList();
	public List<GameVO> readMobileList();
	// public List<GameVO> genreList();
}