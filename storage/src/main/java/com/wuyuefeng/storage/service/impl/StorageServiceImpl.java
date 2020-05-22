package com.wuyuefeng.storage.service.impl;

import com.wuyuefeng.storage.dao.StorageDAO;
import com.wuyuefeng.storage.model.Storage;
import com.wuyuefeng.storage.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    StorageDAO storageDAO;

    //    测试单体应用seata是否生效
//    @GlobalTransactional
    @Override
    public void updateStorage(String commodityCode, Integer count) {
        Storage storage = new Storage();
        storage.setCommodityCode(commodityCode);
        storage.setCount(count);
        storageDAO.updateStorage(storage);

//        int exception = 100 / 0;
    }
}
