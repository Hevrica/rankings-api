package com.rankings.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

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

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date created_at;

	private String age;
}