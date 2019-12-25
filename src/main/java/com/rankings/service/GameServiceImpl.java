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
	public List<GameVO> getOnlineList() {
		List<GameVO> onlineList = gameMapper.read_onlineList();
		log.info("getOnlineList : " +onlineList);
		return onlineList;
	}
	
	@Override
	public List<GameVO> getMobileList() {
		List<GameVO> mobileList = gameMapper.read_mobileList();
		log.info("getMobileList : " + mobileList);
		return mobileList;
	}
	
//	@Override
//	public List<GameVO> getGenreList() {
//		List<GameVO> genreList = gameMapper.read_GenreList();
//		log.info("getGenreList : " + genreList);
//		return genreList;
//	}
}