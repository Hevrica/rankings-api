package com.rankings.service;

import java.util.List;

import com.rankings.domain.GameVO;

public interface GameService {
	public List<GameVO> getOnlineList();
	public List<GameVO> getMobileList();
	// public List<GameVO> getGenreList();
}