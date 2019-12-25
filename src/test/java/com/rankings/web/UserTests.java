package com.rankings.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rankings.domain.UserVO;
import com.rankings.mapper.UserMapper;
import com.rankings.service.UserService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class UserTests {

	@Setter(onMethod_ = @Autowired)
	private UserMapper userMapper;

	@Setter(onMethod_ = @Autowired)
	private UserService userService;

	@Test
	public void test1() {
		UserVO userVO = new UserVO();
		userVO.setEmail("test@test.com");
		userVO.setPwd("12345");
		userVO.setNickname("가입 테스터");
		userVO.setPreference("선호 테스트");
		
		log.info("create : " + userVO);
		if (userMapper.create(userVO)) {
			log.info("create Success");
		}
	}
	
	@Test
	public void test2() {
		UserVO userVO = userMapper.read(1);
		log.info("read : " + userVO);
	}
	
	@Test
	public void test3() {
		UserVO userVO = new UserVO();
		userVO.setId(1);
		userVO.setPwd("67890");
		userVO.setNickname("수정 테스터");
		userVO.setPreference("수정 선호 테스트");
		
		log.info("update : " + userVO);
		if (userMapper.update(userVO)) {
			log.info("update Success");
		}
	}
	
	@Test
	public void test4() {
		log.info("update : " + 1);
		if (userMapper.delete(1)) {
			log.info("delete Success");
		}
	}

	@Test
	public void test5() {
		UserVO userVO = new UserVO();
		userVO.setEmail("servicetest@test.com");
		userVO.setPwd("12345");
		userVO.setNickname("서비스 가입 테스터");
		userVO.setPreference("서비스 선호 테스트");

		log.info("insert : " + userVO);
		if (userService.insert(userVO)) {
			log.info("insert Success");
		}
	}
	
	@Test
	public void test6() {
		log.info("get : " + userService.get(4));
	}

	@Test
	public void test7() {
		UserVO userVO = new UserVO();
		userVO.setId(4);
		userVO.setPwd("67890");
		userVO.setNickname("수정 서비스 테스터");
		userVO.setPreference("수정 서비스 선호 테스트");

		log.info("modify : " + userVO);
		if (userService.modify(userVO)) {
			log.info("modify Success");
		}
	}

	@Test
	public void test8() {
		log.info("remove : " + 4);
		if (userService.remove(4)) {
			log.info("remove Success");
		}
	}
}