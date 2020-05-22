package io.seata.samples.business.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class AccountClient {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<Integer> create(String userId, int spendMoney) {
        String url = "http://127.0.0.1:8083/account/update?userId=" + userId + "&spendMoney=" + spendMoney;
        try {
            return restTemplate.getForEntity(url, Integer.class);
        } catch (Exception e) {
            log.error("create url {} ,error:", url);
            throw new RuntimeException();
        }
    }
}
