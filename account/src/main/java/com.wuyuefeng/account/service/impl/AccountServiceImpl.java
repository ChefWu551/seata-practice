package com.wuyuefeng.account.service.impl;

import com.wuyuefeng.account.dao.AccountDAO;
import com.wuyuefeng.account.model.Account;
import com.wuyuefeng.account.service.AccountService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDAO accountDAO;

    //    测试单体应用seata是否生效
//    @GlobalTransactional
    @Override
    public Integer setAccount(String userId, Integer spendMoney) {

        Integer currentMoney = accountDAO.getAccountMoney(userId);

        Account account = new Account();
        account.setUserId(userId);
        account.setMoney(currentMoney - spendMoney);

        accountDAO.updateAccount(account);

        if (!"1001".equals(userId)) {
            throw new RuntimeException("没有找到该用户");
        }

        return 1;
//        int exceptionCode = 100 / 1 ;
    }
}
