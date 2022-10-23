package cn.egret.service.impl;

import cn.egret.bean.UserAddress;
import cn.egret.service.OrderService;
import cn.egret.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//@Service
@Component
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference(loadbalance = "roundrobin")
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id：" + userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }


    public List<UserAddress> hello(String userId) {
        return Arrays.asList(new UserAddress(10, "测试地址", "1", "测试", "测试", "Y"));
    }


}