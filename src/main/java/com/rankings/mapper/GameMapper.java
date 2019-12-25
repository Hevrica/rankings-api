package com.rankings.mapper;

import java.util.List;

import com.rankings.domain.GameVO;

public interface GameMapper {
	public List<GameVO> read_onlineList();
	public List<GameVO> read_mobileList();
	// public List<GameVO> read_genreList();
}