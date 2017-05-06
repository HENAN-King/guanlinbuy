package com.guanlinbuy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guanlinbuy.entity.Goods;
import com.guanlinbuy.service.GoodsService;

@RestController
@RequestMapping("goods")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public List<Goods> selectALLgoods() {
		return goodsService.selectAllGoods();
	}
}
