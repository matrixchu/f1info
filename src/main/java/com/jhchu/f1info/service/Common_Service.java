package com.jhchu.f1info.service;

import com.jhchu.f1info.dao.JdbcQueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Common_Service {

    @Autowired
    private JdbcQueryDao jdbcQueryDao;


    public List<Map<String,String>> getTableColumn(String tableName, List<String> filterColumn){
        return jdbcQueryDao.getTableColumnInfo(tableName);
    }
}
