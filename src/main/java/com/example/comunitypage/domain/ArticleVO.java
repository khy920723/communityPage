package com.example.comunitypage.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class ArticleVO {

    private Integer article_no;
    private String title;
    private String content;
    private String writer;
    private Timestamp regDate;
    private int viewCnt;
}
