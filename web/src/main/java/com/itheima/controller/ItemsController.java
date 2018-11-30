package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @Author:  Yajun_Xu
 * @Create: 2018/11/27 19:10
 **/

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("findById")
    public String findById(Model model) {
        System.out.println ("1213");
        Items itmesById = itemsService.findItmesById (1);
        model.addAttribute ("item", itmesById);
        System.out.println (itmesById);
        System.out.println ("hello,world");
        return "itemDetail";
    }
}
