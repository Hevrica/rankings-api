package com.rankings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rankings.domain.GameVO;
import com.rankings.mapper.GameMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class GameServiceImpl implements GameService {

	@Setter(onMethod_ = @Autowired)
	private GameMapper gameMapper;
	
	@Override
	public GameVO onlineGame(int game_id) {
		log.info("onlineGame : " + game_id);
		return gameMapper.onlineGame(game_id);
	}
	
	@Override
	public List<GameVO> onlineGameList() {
		log.info("onlineGameList : " + gameMapper.onlineGameList());
		return gameMapper.onlineGameList();
	}
}