package com.rankings.domain;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class NoticeVO {

    private Long id;
    private String title;
    private String writer;
    private String content;
    private String image;
    private Date create_date;
    private Date update_date;

}
