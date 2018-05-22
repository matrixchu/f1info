package com.jhchu.f1info.service;

import com.jhchu.f1info.dao.JdbcQueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jhchu.f1info.dao.f1teamDao;
import com.jhchu.f1info.entity.f1team;
import java.util.List;
import java.util.Map;

@Service
public class f1team_service {

    @Autowired
    private f1teamDao f1teamdao;



    public List<f1team> getF1TeamInfoByName(String team_name){
        return f1teamdao.queryf1teamByTeamName(team_name);
    }

    public List<f1team> getAllF1TeamInfo(){
        return f1teamdao.queryAllf1team();
    }

    public f1team insertF1TeamInfo(f1team f1teamInfo){
        return f1teamdao.save(f1teamInfo);
    }


}
