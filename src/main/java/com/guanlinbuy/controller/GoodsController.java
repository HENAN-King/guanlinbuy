package com.guanlinbuy.controller;

import com.guanlinbuy.entity.Goods;
import com.guanlinbuy.service.GoodsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	private static Logger logger =Logger.getLogger(GoodsController.class);
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public List<Goods> selectALLgoods() {
		logger.info("selectALLgoods");
		return goodsService.selectAllGoods();
	}
}
