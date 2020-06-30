package com.liulang.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.liulang.dao.CommodityOrderMapper;
import com.liulang.model.CommodityOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/user")
@Controller
public class UserController {

    @Resource(name="commodityOrderMapper")
    private CommodityOrderMapper co;
    
    @RequestMapping("/byrecord")
    @ResponseBody
    public String obtainOrderRecord(String openid){
        CommodityOrder coEntity = co.selectByOpenid(openid);
        coEntity.setByTimeAfter(coEntity.getByTime());
        return JSON.toJSONString(coEntity);
    }
}


