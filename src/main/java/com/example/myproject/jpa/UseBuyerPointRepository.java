package com.example.myproject.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UseBuyerPointRepository extends JpaRepository<UseBuyerPoint,String>{

        UseBuyerPoint findByUserId(String userId);

        @Query(value = "select * from use_buyer_point u where u.user_points=?1",nativeQuery = true)
//        @Query("select u from UseBuyerPoint u where u.userPoints= ?1")
        List<UseBuyerPoint> findByUserPoints(Integer userPoints);
}
