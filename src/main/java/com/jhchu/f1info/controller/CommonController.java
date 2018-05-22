package com.jhchu.f1info.controller;

import com.jhchu.f1info.service.Common_Service;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(tags = "通用的服务接口")
@RestController
@CrossOrigin
@RequestMapping(value = "/api/f1info/v1")
public class CommonController {

    @Autowired
    Common_Service common_service;

    @ApiOperation("获取表头信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tableName", paramType = "query", dataTypeClass = String.class, required = true, value = "tableName") })
    @ApiResponse(code = 200,message = "接口有返回",response = List.class)
    @RequestMapping(method = RequestMethod.GET,value = "/tableColumnInfo")
    public List<Map<String,String>> getTableColumnInfo(@RequestParam(name = "tableName") String tableName){
        return common_service.getTableColumn(tableName,null);
    }
}
