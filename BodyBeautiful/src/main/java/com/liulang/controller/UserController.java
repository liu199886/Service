package com.liulang.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.liulang.dao.CommodityOrderMapper;
import com.liulang.model.CommodityOrder;
import com.liulang.model.User;
import com.liulang.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/user")
@Controller
public class UserController {

    @Resource(name="commodityOrderMapper")
    private CommodityOrderMapper co;

    @Resource(name="userServiceImpl")
    private UserService us;
    
    @RequestMapping("/byrecord")
    @ResponseBody
    public String obtainOrderRecord(String openid){
        CommodityOrder coEntity = co.selectByOpenid(openid);
        coEntity.setByTimeAfter(coEntity.getByTime());
        return JSON.toJSONString(coEntity);
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public String addToUser(@RequestBody  User user){
        System.out.println("user: "+user);
        return JSON.toJSONString(us.addUser(user));
    }
}


