package com.lxh.com.shop_sevice_impl.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lxh.entity.Goods;
import com.lxh.service.IGoodsService;
import com.lxh.shop.dao.IGoodsDao;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;
@Service
public class GoodsServiceImpl implements IGoodsService{
    @Autowired
    private IGoodsDao goodsDao;

    @Override
    public List<Goods> queryAll() {
        System.out.println("调用了service实现了in");
        return goodsDao.queryAll();
    }
}
