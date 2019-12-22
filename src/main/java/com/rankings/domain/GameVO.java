package com.rankings.domain;

import java.util.Date;

import lombok.Data;

@Data
public class GameVO {
	private int game_id;
	private String game_name;
	private String game_link;
	private String game_company;
	private String game_image;
	private String game_genre;
	private String game_division;
	private int game_rank;
	private Date game_week;
	private String game_age;
}