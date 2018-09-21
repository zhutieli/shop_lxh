package com.lxh.com.shop_sevice_impl;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lxh.shop.dao")
@DubboComponentScan("com.lxh.com.shop_sevice_impl.serviceimpl")
public class ShopSeviceImplApplication {
/*
*
*
*com\lxh\shop\shop_service_impl\GoodsServiceImpl.java
* */
	public static void main(String[] args) {
		SpringApplication.run(ShopSeviceImplApplication.class, args);
	}
}
