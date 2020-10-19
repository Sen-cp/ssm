package com.itheima.service.Impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    public void save(Items items) {
        itemsDao.save(items);
    }
}
