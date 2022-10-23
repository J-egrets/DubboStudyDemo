package cn.egret.controller;

import cn.egret.bean.UserAddress;
import cn.egret.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@RequestMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("uid")String userId) {
		System.out.println(11111);
		return orderService.initOrder(userId);
	}

}