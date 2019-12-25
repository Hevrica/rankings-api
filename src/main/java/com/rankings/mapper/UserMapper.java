package com.rankings.mapper;

import com.rankings.domain.UserVO;

public interface UserMapper {
	public boolean create(UserVO userVO);
	public UserVO read(int id);
	public boolean update(UserVO userVO);
	public boolean delete(int id);
}