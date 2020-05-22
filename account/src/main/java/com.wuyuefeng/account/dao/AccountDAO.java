package com.wuyuefeng.account.dao;

import com.wuyuefeng.account.model.Account;
import org.apache.ibatis.annotations.Param;

public interface AccountDAO {

    Integer getAccountMoney(@Param("userId") String userId);

    void updateAccount(Account account);
}
