package com.example.demo.service;

import com.example.demo.dao.matchDao;
import com.example.demo.model.Aoke;
import com.example.demo.model.Wangyi;
import com.example.demo.model.matchHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AokeService {

    @Resource
    matchDao matchDao;

    public List<Aoke> getAokeList(String search){
        return matchDao.getAokeList(search);
    }

    /**
     * 获取比赛数据及比赛历史数据
     */
    public List<Map<String,Object>> getMatchHistory(){
        List<Map<String,Object>> list = new ArrayList<>();
        List<Wangyi> mainData = matchDao.getWangyiData();
        for( int i = 0 ; i < mainData.size(); i++){
            Map<String,Object> item = new HashMap<>();
            item.put("matchId",mainData.get(i).getId());
            item.put("matchNum",mainData.get(i).getMatchNum());
            item.put("hostTeamName",mainData.get(i).getHostTeamName());
            item.put("guestTeamName",mainData.get(i).getGuestTeamName());
            item.put("competitionName",mainData.get(i).getCompetitionName());
            item.put("matchTime",mainData.get(i).getMatchTime());
            List<Map<String,Object>> hostHistoryList = new ArrayList<>();
            List<Map<String,Object>> guestHistoryList = new ArrayList<>();
            List<matchHistory> hostHistory = matchDao.getHostTeamHistoryList(mainData.get(i).getId());
            List<matchHistory> guestHistory = matchDao.getGuestTeamHistoryList((mainData.get(i).getId()));
            for( int j = 0 ; j < hostHistory.size(); j++){
                matchHistory host_item = hostHistory.get(j);
                Map<String,Object> hostHistoryItem = new HashMap<>();
                hostHistoryItem.put("id",host_item.getId());
                hostHistoryItem.put("hostScore",host_item.getHostScore());
                hostHistoryItem.put("guestScore",host_item.getGuestScore());
                hostHistoryItem.put("hostTeamName",host_item.getHostTeamName());
                hostHistoryItem.put("guestTeamName",host_item.getGuestTeamName());
                hostHistoryList.add(hostHistoryItem);
            }
            item.put("hostMatchList",hostHistoryList);
            for( int k = 0 ; k < guestHistory.size(); k++){
                matchHistory guest_item = guestHistory.get(k);
                Map<String,Object> guestHistoryItem = new HashMap<>();
                guestHistoryItem.put("id",guest_item.getId());
                guestHistoryItem.put("hostScore",guest_item.getHostScore());
                guestHistoryItem.put("guestScore",guest_item.getGuestScore());
                guestHistoryItem.put("hostTeamName",guest_item.getHostTeamName());
                guestHistoryItem.put("guestTeamName",guest_item.getGuestTeamName());
                guestHistoryList.add(guestHistoryItem);
            }
            item.put("guestMatchList",guestHistoryList);
            list.add(item);
        }
        System.out.println(mainData);
        return list;
    }
}
