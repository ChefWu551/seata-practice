package com.wuyuefeng.order.model;

import lombok.Data;

@Data
public class Order {

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer money;

}
