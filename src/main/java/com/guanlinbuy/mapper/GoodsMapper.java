package com.guanlinbuy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.guanlinbuy.entity.Goods;

@Mapper
public interface GoodsMapper {

	@Select("select * from goods")
	@Results({ @Result(property = "goodsName", column = "goods_name"),
			@Result(property = "goodsDesc", column = "goods_desc"),
			@Result(property = "goodsImgUrls", column = "goods_img_urls"),
			@Result(property = "goodsCategory", column = "goods_category"),
			@Result(property = "goodsUrl", column = "goods_url"),
			@Result(property = "goodsCouponUrl", column = "goods_coupon_url"),
			@Result(property = "goodsCount", column = "goods_count"),
			@Result(property = "goodsPrice", column = "goods_price"),
			@Result(property = "goodsCouponPrice", column = "goods_coupon_price"),
			@Result(property = "goodsCommision", column = "goods_commision"),
			@Result(property = "gmtCreate", column = "gmt_create"),
			@Result(property = "gmtModify", column = "gmt_modify") })
	public List<Goods> selectAll();

	@Insert("INSERT INTO goods(goods_name,goods_desc,goods_img_urls,goods_category,goods_url,goods_coupon_url,goods_count,goods_price,goods_coupon_price,goods_commision,gmt_create,gmt_modify) "
			+ "VALUES (#{goodsName},#{goodsDesc},#{goodsImgUrls},#{goodsCategory},#{goodsUrl},#{goodsCouponUrl},#{goodsCount},#{goodsPrice},#{goodsCouponPrice},#{goodsCommision},#{gmtCreate},#{gmtModify},)")
	public int insert(Goods goods);
}
