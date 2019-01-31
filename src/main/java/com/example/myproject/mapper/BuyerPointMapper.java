package com.example.myproject.mapper;

import com.example.myproject.entity.UseBuyerPoint;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BuyerPointMapper {

    @Select("SELECT * FROM use_buyer_point WHERE user_points = #{userPoints}")
    List<UseBuyerPoint> select(Integer userPoints);

}
