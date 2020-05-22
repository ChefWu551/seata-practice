package com.wuyuefeng.order.controller;

import com.wuyuefeng.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/debit")
    public void setOrder(@RequestParam String userId, @RequestParam String commodityCode, @RequestParam Integer count){
        orderService.setOrder(userId, commodityCode, count);
    }
}
