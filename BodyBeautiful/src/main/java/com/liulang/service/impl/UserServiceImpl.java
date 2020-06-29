package com.liulang.service.impl;

import com.liulang.dao.CommodityOrderMapper;
import com.liulang.model.CommodityOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

@Service("userServiceImpl")
public class UserServiceImpl  implements UserService{

    @Resource(name="commodityOrderMapper")
    private CommodityOrderMapper commodityOrderMapper;

    @Override
    public String getByTime(String openid) {
        CommodityOrder commOrder = commodityOrderMapper.selectByOpenid(openid);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String byTime = formatter.format(commOrder.getByTime());
        return byTime;
    }
}
