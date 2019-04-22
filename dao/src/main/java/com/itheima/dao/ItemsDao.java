package com.itheima.dao;

import com.itheima.domain.Items;

import java.beans.Introspector;

/*
 * @Author:  Yajun_Xu
 * @Create: 2018/11/27 13:00
 **/
public interface ItemsDao {
    Items findItmesById(Integer i);
    Items findOne(Introspector introspector);
}
