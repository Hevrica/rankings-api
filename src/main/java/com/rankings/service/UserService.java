package com.rankings.service;

import com.rankings.domain.UserVO;

public interface UserService {
	public boolean insert(UserVO userVO);
	public UserVO get(int id);
	public boolean modify(UserVO userVO);
	public boolean remove(int id);
}