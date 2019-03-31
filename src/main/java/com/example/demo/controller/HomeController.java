package com.example.demo.controller;

import com.example.demo.model.Aoke;
import com.example.demo.service.AokeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    @Resource
    AokeService aokeService;

    @GetMapping("/index")
    public List<Aoke> index(@RequestParam(value="search",required=false) String search){

        System.out.println(search);
        List<Aoke> list = aokeService.getAokeList(search);

        return list;
    }

    @GetMapping("/matches")
    public List<Map<String,Object>> matches(){
        Long start = System.currentTimeMillis();
        List<Map<String,Object>> list = aokeService.getMatchHistory();
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
        return list;
    }
}
