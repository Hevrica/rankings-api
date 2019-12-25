package com.rankings.domain;

import lombok.Data;

@Data
public class UserVO {
	private int id;
	private String email;
	private String pwd;
	private String nickname;
	private String preference;
}