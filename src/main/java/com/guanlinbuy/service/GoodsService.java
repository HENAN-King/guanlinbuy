package com.guanlinbuy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guanlinbuy.entity.Goods;
import com.guanlinbuy.mapper.GoodsMapper;

@Service
public class GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;

	public List<Goods> selectAllGoods() {
		return goodsMapper.selectAll();
	}
}
