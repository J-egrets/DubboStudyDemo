package cn.egret.service;

import cn.egret.bean.UserAddress;

import java.util.List;

/**
 * @author egret
 */
public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}