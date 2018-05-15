package com.jhchu.f1info.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jhchu.f1info.service.f1team_service;
import com.jhchu.f1info.entity.f1team;
import java.util.List;


@Api(tags = "F1车队信息维护接口")
@RestController
@RequestMapping(value = "/api/f1info/v1/f1team")
public class F1TeamController {
    @Autowired
    private f1team_service f1teamService;

    @ApiOperation("根据名称，获取F1车队的信息列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "team_name", paramType = "query", dataTypeClass = String.class, required = false, value = "team_name") })
    @ApiResponse(code = 200, message = "接口有返回", response = List.class)
    @RequestMapping(method = RequestMethod.GET, value = "/teaminfo")
    public List<f1team> getF1teamInfo( @RequestParam(name = "team_name") String team_name){
        return f1teamService.getF1TeamInfoByName(team_name);
    }

}
