package com.guanlinbuy.controller;

import com.guanlinbuy.entity.Goods;
import com.guanlinbuy.service.GoodsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	private static Logger logger = Logger.getLogger(GoodsController.class);

	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public List<Goods> selectALLgoods(@RequestParam("start") Integer start, @RequestParam("size") Integer size) {
		logger.info("selectALLgoods");
		return goodsService.selectAllGoods(start, size);
	}

	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public int update(Goods goods) {
		logger.info("update goods id : " + goods.getId());
		return goodsService.updateStat(goods);
	}

	@RequestMapping(path = "/findById", method = RequestMethod.GET)
	public Goods findById(@RequestParam Long id) {
		logger.info("update goods id : " + id);
		return goodsService.findById(id);
	}
}
