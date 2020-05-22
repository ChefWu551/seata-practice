package com.wuyuefeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@SpringBootApplication
//@EnableTransactionManagement
//@ComponentScan
@MapperScan("com.wuyuefeng.account.dao")
@SpringBootApplication(scanBasePackages = "com.wuyuefeng", exclude = DataSourceAutoConfiguration.class)
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
