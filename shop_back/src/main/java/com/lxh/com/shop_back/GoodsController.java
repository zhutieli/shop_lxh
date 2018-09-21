package com.lxh.com.shop_back;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.gson.Gson;
import com.lxh.entity.Goods;
import com.lxh.service.IGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Reference
    private IGoodsService goodsService;

    @RequestMapping("/goodslist")
    public  String goodsManager(){
        System.out.println("调用了service实现类");
          List<Goods> goods=goodsService.queryAll();
          System.out.println("数据"+new Gson().toJson(goods));
        return new Gson().toJson(goods);

    }
}
