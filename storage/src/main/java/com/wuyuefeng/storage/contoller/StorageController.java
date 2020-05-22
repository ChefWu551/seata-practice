package com.wuyuefeng.storage.contoller;

import com.wuyuefeng.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/storage")
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @RequestMapping("/deduct")
    public void updateStorage(@RequestParam String commodityCode, @RequestParam Integer count){
        storageService.updateStorage(commodityCode, count);
    }
}
