package com.rankings.web;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rankings.mapper.GameMapper;
import com.rankings.service.GameService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class GameTests {
	
	@Setter(onMethod_ = {@Autowired})
	private DataSource dataSource;
	
	@Setter(onMethod_ = {@Autowired})
	private GameMapper gameMapper;
	
	@Setter(onMethod_ = {@Autowired})
	private GameService gameService;
	
	@Test
	public void test() {
		gameService.getOnlineList().forEach(game -> log.info(game));
	}
}