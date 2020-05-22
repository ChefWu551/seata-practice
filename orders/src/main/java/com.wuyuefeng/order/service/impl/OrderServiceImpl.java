package com.wuyuefeng.order.service.impl;

import com.wuyuefeng.order.client.AccountClient;
import com.wuyuefeng.order.dao.OrderDAO;
import com.wuyuefeng.order.model.Order;
import com.wuyuefeng.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private static Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    OrderDAO orderDAO;

    @Autowired
    AccountClient accountClient;

    //    测试单体应用seata是否生效
//    @GlobalTransactional
    @Override
    public void setOrder(String userId, String commodity, Integer count) {
        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodity);
        order.setCount(count);
        order.setMoney(count * 5);

        orderDAO.saveOrder(order);

        accountClient.create(userId, order.getMoney());
        logger.info("更新余额prepare完毕");
//        int exception = 100 / 0;
    }
}
