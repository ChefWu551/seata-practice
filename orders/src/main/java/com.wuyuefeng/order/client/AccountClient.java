package com.wuyuefeng.order.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class AccountClient {

    @Autowired
    private RestTemplate restTemplate;

    public void create(String userId, int spendMoney) {
        String url = "http://127.0.0.1:8083/account/update?userId=" + userId + "&spendMoney=" + spendMoney;
        try {
            restTemplate.getForEntity(url, Void.class);
        } catch (Exception e) {
            log.error("create url {} ,error:", url);
            throw new RuntimeException();
        }
    }
}
