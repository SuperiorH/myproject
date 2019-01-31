package com.example.myproject.jpa;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="use_buyer_point")
@Data
public class UseBuyerPoint {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy="uuid")
    private String id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_points")
    private Integer userPoints;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "deleted")
    private Boolean deleted;

    public UseBuyerPoint(String userId, Integer userPoints, Date createTime, Date updateTime, Boolean deleted) {
        this.userId = userId;
        this.userPoints = userPoints;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleted = deleted;
    }

    public UseBuyerPoint() {

    }

}
