package com.example.myproject.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UseBuyerPoint {
    private String id;
    private String userId;
    private Integer userPoints;
    private Date createTime;
    private Date updateTime;
    private Integer deleted;

    public UseBuyerPoint(String id, String userId, Integer userPoints) {
        this.id = id;
        this.userId = userId;
        this.userPoints = userPoints;
    }

    public UseBuyerPoint() {
    }
}
