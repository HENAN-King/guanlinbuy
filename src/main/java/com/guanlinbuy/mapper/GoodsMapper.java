package com.guanlinbuy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.guanlinbuy.entity.Goods;

@Mapper
public interface GoodsMapper {

	@Select("select * from goods where publish_stat = 1 limit #{0},#{1}")
	@Results({ @Result(property = "goodsId", column = "goods_id"),
			@Result(property = "goodsName", column = "goods_name"),
			@Result(property = "goodsDesc", column = "goods_desc"),
			@Result(property = "goodsImgUrls", column = "goods_img_urls"),
			@Result(property = "goodsCategory", column = "goods_category"),
			@Result(property = "goodsUrl", column = "goods_url"),
			@Result(property = "goodsCouponUrl", column = "goods_coupon_url"),
			@Result(property = "goodsCount", column = "goods_count"),
			@Result(property = "goodsPrice", column = "goods_price"),
			@Result(property = "goodsCouponPrice", column = "goods_coupon_price"),
			@Result(property = "goodsCommision", column = "goods_commision"),
			@Result(property = "publishStat", column = "publish_stat"),
			@Result(property = "gmtCreate", column = "gmt_create"),
			@Result(property = "gmtModify", column = "gmt_modify") })
	public List<Goods> selectAll(int start, int size);

	@Insert("INSERT INTO goods(goods_id,goods_name,goods_desc,goods_img_urls,goods_category,goods_url,goods_coupon_url,goods_count,goods_price,goods_coupon_price,goods_commision,publish_stat,gmt_create,gmt_modify) "
			+ "VALUES (#{goodsId},#{goodsName},#{goodsDesc},#{goodsImgUrls},#{goodsCategory},#{goodsUrl},#{goodsCouponUrl},#{goodsCount},#{goodsPrice},#{goodsCouponPrice},#{goodsCommision},#{publishStat},#{gmtCreate},#{gmtModify})")
	public int insert(Goods goods);

	@Update("update goods set publish_stat = #{publishStat} where id = #{id}")
	public int updateStat(Goods goods);

	@Select("select * from goods where publish_stat = 1 and id = #{id}")
	@Results({ @Result(property = "goodsId", column = "goods_id"),
			@Result(property = "goodsName", column = "goods_name"),
			@Result(property = "goodsDesc", column = "goods_desc"),
			@Result(property = "goodsImgUrls", column = "goods_img_urls"),
			@Result(property = "goodsCategory", column = "goods_category"),
			@Result(property = "goodsUrl", column = "goods_url"),
			@Result(property = "goodsCouponUrl", column = "goods_coupon_url"),
			@Result(property = "goodsCount", column = "goods_count"),
			@Result(property = "goodsPrice", column = "goods_price"),
			@Result(property = "goodsCouponPrice", column = "goods_coupon_price"),
			@Result(property = "goodsCommision", column = "goods_commision"),
			@Result(property = "publishStat", column = "publish_stat"),
			@Result(property = "gmtCreate", column = "gmt_create"),
			@Result(property = "gmtModify", column = "gmt_modify") })
	public Goods findById(Long id);
}
