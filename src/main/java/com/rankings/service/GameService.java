package com.rankings.service;

import java.util.List;

import com.rankings.domain.GameVO;

public interface GameService {
	public GameVO onlineGame(int game_id);
	public List<GameVO> onlineGameList();
}