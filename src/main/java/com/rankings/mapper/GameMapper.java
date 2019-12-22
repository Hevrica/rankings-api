package com.rankings.mapper;

import java.util.List;

import com.rankings.domain.GameVO;

public interface GameMapper {
	public GameVO onlineGame(int game_id);
	public List<GameVO> onlineGameList();
}