package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @Author:  Yajun_Xu
 * @Create: 2018/11/27 13:59
 **/
@Service
public class ItemsImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    public Items findItmesById(Integer i) {
        return itemsDao.findItmesById (i);
    }
}
