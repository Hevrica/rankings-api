package com.rankings.domain;

import java.util.Date;

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
	private Date g_month;
	private Date g_week;
	private String age;
}