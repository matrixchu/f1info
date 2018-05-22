package com.jhchu.f1info.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JdbcQueryDao {

    private static Logger logger = LoggerFactory
            .getLogger(JdbcQueryDao.class);

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    /**
     * 根据表名，获取表的列名和注释
     * @param tableName  要查询的表名
     * @return   表名、注释组成的List
     */
    public List<Map<String,String>> getTableColumnInfo(String tableName){

       String sqlStr = "select column_name, column_comment from information_schema.columns where table_schema ='f1infodb' and table_name = ? order by ordinal_position";

       String[] params = new String[1];

       params[0] = tableName;
       return jdbcTemplate.query(sqlStr,params,new RowMapper<Map<String,String>>() {

            @Override
            public Map<String,String> mapRow(ResultSet rs,
                                               int rowNum) throws SQLException {
                Map<String,String> columnInfoMap = new HashMap<>();

                columnInfoMap.put("prop",rs.getString("column_name"));
                columnInfoMap.put("label",rs.getString("column_comment"));

                return columnInfoMap;

            }
        });


    }
}
