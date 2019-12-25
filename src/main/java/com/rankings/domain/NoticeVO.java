package com.rankings.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
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

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date created_at;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updated_at;

}
