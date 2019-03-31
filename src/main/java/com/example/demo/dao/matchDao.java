package com.example.demo.dao;

import com.example.demo.model.Aoke;
import com.example.demo.model.Wangyi;
import com.example.demo.model.matchHistory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface matchDao {
    /**
     * 获取比赛列表
     */
    List<Aoke> getAokeList(@Param("search") String search);

    /**
     * 获取网易数据
     */
    List<Wangyi> getWangyiData();

    /**
     * 获取主队历史数据
     */
   List<matchHistory> getHostTeamHistoryList(@Param("sourceId") Integer sourceId);
    /**
     * 获取客队历史数据
     */
    List<matchHistory> getGuestTeamHistoryList(@Param("sourceId") Integer sourceId);
}
