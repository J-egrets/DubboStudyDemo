package cn.egret.service.impl;

import cn.egret.bean.UserAddress;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Test
    public void testInitOrder() {
        List<UserAddress> res = orderService.initOrder("1");
        Assert.assertThat(res, Matchers.notNullValue());
    }

    @Test
    public void testHello() {
        List<UserAddress> res = orderService.hello("1");
        Assert.assertThat(res, Matchers.notNullValue());
    }
}