package com.example.myproject.controller;

import com.example.myproject.async.AsyncComponent;
import com.example.myproject.config.RedisParam;
import com.example.myproject.entity.Order;
import com.example.myproject.jpa.UseBuyerPointRepository;
import com.example.myproject.mapper.BuyerPointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.concurrent.Future;

@RestController
public class MyController {

    @Autowired
    private BuyerPointMapper mapper;
    @Autowired
    private RedisParam param;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private AsyncComponent component;
    @Autowired
    private UseBuyerPointRepository repository;

//    @RequestMapping("/h1/{points}/{index}/{count}")
//    public Response<PageInfo<UseBuyerPoint>> search(@PathVariable Integer points, @PathVariable Integer index, @PathVariable Integer count) {
//        PageHelper.startPage(index, count);
//        List<UseBuyerPoint> list = mapper.select(points);
//        PageInfo<UseBuyerPoint> page = new PageInfo(list);
//        redisTemplate.opsForValue().set("myKey", parse(list).toString(), 1800, TimeUnit.SECONDS);
//        return new Response<>(page);
//    }

    @RequestMapping("/h2")
    public String h2() {
        return param.toString();
    }

    @RequestMapping("/h3")
    public String h3() {
        Future<String> task1 = component.m1();
        Future<String> task2 = component.m2();
        while (true) {
            if (task1.isDone() && task2.isDone()) {
                break;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "success";
    }

//    @RequestMapping("/h4")
//    public String h4() {
//        List<UseBuyerPoint> list = repository.findByUserPoints(650);
//        System.out.println(list);
//        return "success";
//    }

    @PostMapping("/h5")
    public String h5(@RequestBody @Valid Order order) {
        System.out.println(order);
        return "success";
    }



}
