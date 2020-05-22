package com.wuyuefeng.account.controller;

import com.wuyuefeng.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/update")
    public Integer setOrder(@RequestParam String userId, @RequestParam Integer spendMoney){
        return accountService.setAccount(userId, spendMoney);
    }
}
