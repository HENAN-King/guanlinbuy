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

	public List<Goods> selectAllGoods(int start, int size) {
		return goodsMapper.selectAll(start, size);
	}

	public int updateStat(Goods goods) {
		return goodsMapper.updateStat(goods);
	}

	public Goods findById(Long id) {
		return goodsMapper.findById(id);
	}
}
