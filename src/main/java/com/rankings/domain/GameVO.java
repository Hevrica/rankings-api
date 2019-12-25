package com.rankings.domain;

import lombok.Data;

@Data
public class GameVO {
	private int id;
	private String name;
	private String link;
	private String company;
	private String image;
	private String genre;
	private String division;
	private int g_rank;
	private String g_month;
	private String g_week;
	private String age;
}