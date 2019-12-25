package com.rankings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rankings.domain.UserVO;
import com.rankings.mapper.UserMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class UserServiceImpl implements UserService {
	
	@Setter(onMethod_ = @Autowired)
	private UserMapper userMapper;
	
	@Override
	public boolean insert(UserVO userVO) {
		log.info("insert : " + userVO);
		return userMapper.create(userVO);
	}

	@Override
	public UserVO get(int id) {
		UserVO userVO = userMapper.read(id);
		log.info("get : " + userVO);
		return userVO;
	}

	@Override
	public boolean modify(UserVO userVO) {
		log.info("modify : " + userVO);
		return userMapper.update(userVO);
	}

	@Override
	public boolean remove(int id) {
		log.info("remove : " + id);
		return userMapper.delete(id);
	}
}