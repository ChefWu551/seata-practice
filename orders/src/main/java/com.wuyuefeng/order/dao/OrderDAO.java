package com.wuyuefeng.order.dao;

import com.wuyuefeng.order.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDAO {

    void saveOrder(Order order);
}
