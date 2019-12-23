package com.rankings.domain;

import lombok.Data;

import java.util.Date;

@Data
public class NoticeVO {

    private Long notice_id;
    private String notice_title;
    private String notice_writer;
    private String notice_content;
    private String notice_image;
    private Date notice_create_date;
    private Date notice_update_date;

}
