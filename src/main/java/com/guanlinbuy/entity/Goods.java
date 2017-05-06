package com.guanlinbuy.entity;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {

	private static final long serialVersionUID = 3584926263847870694L;

	private Long id;
	
	/**
	 * 商品名称
	 */
	private String goodsName;
	
	/**
	 * 商品描述
	 */
	private String goodsDesc;
	
	/**
	 * 商品图片url，多个‘；’隔开
	 */
	private String goodsImgUrls;
	
	/**
	 * 商品类目
	 */
	private String goodsCategory;
	
	/**
	 * 商品url
	 */
	private String goodsUrl;
	
	/**
	 * 商品优惠券url
	 */
	private String goodsCouponUrl;
	
	/**
	 * 商品数量
	 */
	private Integer goodsCount;
	
	/**
	 * 商品价格，分为单位
	 */
	private Integer goodsPrice;
	
	/**
	 * 商品优惠金额
	 */
	private Integer goodsCouponPrice;
	
	/**
	 * 佣金比例，百分比
	 */
	private Integer goodsCommision;
	
	private Date gmtCreate;
	
	private Date gmtModify;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getGoodsImgUrls() {
		return goodsImgUrls;
	}

	public void setGoodsImgUrls(String goodsImgUrls) {
		this.goodsImgUrls = goodsImgUrls;
	}

	public String getGoodsCategory() {
		return goodsCategory;
	}

	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getGoodsUrl() {
		return goodsUrl;
	}

	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}

	public String getGoodsCouponUrl() {
		return goodsCouponUrl;
	}

	public void setGoodsCouponUrl(String goodsCouponUrl) {
		this.goodsCouponUrl = goodsCouponUrl;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Integer getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getGoodsCouponPrice() {
		return goodsCouponPrice;
	}

	public void setGoodsCouponPrice(Integer goodsCouponPrice) {
		this.goodsCouponPrice = goodsCouponPrice;
	}

	public Integer getGoodsCommision() {
		return goodsCommision;
	}

	public void setGoodsCommision(Integer goodsCommision) {
		this.goodsCommision = goodsCommision;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModify() {
		return gmtModify;
	}

	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}
}
