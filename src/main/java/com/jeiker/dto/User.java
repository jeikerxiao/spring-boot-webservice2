package com.jeiker.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Created by Administrator on 2018/7/10 0010.
 */
@Data
@ToString
public class User {

    private String userId;
    private String username;
    private String age;
    private Date updateTime;

}
