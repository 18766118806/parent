package com.itheima.dao;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr;
import com.itheima.domain.Items;

import java.beans.Introspector;

/*
 * @Author:  Yajun_Xu
 * @Create: 2018/11/27 13:00
 **/
public interface ItemsDao {
    Items findItmesById(Integer i);
    Items findOne(Introspector introspector);
    Items findOne_(Introspector introspector);
}
