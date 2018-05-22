package com.jhchu.f1info.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jhchu.f1info.service.f1team_service;
import com.jhchu.f1info.entity.f1team;
import java.util.List;
import java.util.Map;


@Api(tags = "F1车队信息维护接口")
@RestController
@CrossOrigin
@RequestMapping(value = "/api/f1info/v1/f1team")
public class F1TeamController {
    @Autowired
    private f1team_service f1teamService;

    @ApiOperation("根据名称，获取F1车队的信息列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "team_name", paramType = "query", dataTypeClass = String.class, required = false, value = "team_name") })
    @ApiResponse(code = 200, message = "接口有返回", response = List.class)
    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public List<f1team> getF1teamInfo( @RequestParam(name = "team_name") String team_name){
        return f1teamService.getF1TeamInfoByName(team_name);
    }



    @ApiOperation("获取所有的F1车队信息")
    @ApiResponse(code = 200, message = "接口有返回", response = List.class)
    @RequestMapping(method = RequestMethod.GET, value = "/allinfo")
    public List<f1team> getAllF1Team(){
        return f1teamService.getAllF1TeamInfo();
    }

    @ApiOperation("增加F1车队信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name ="f1TeamStr",paramType = "insert", dataTypeClass = f1team.class,required = true,value = "f1Team")
    })
    @ApiResponse(code = 200,message = "接口有返回",response = f1team.class)
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    public f1team insertF1TeamInfo( @RequestBody f1team f1Team){
//        JSONObject f1TeamInfoObj = JSONObject.parseObject(f1TeamStr);
//        f1team f1TeamInfo = f1TeamInfoObj.toJavaObject(f1team.class);
        return f1teamService.insertF1TeamInfo(f1Team);
    }

}
