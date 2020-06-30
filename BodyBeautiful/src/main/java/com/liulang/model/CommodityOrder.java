package com.liulang.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommodityOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_order.orderid
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    private Integer orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_order.order_no
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_order.openid
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_order.goodsid
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_order.order_amount_total
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    private Double orderAmountTotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_order.by_time
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    private Date byTime;

    /**
     * 为了取得一个用户可读取的日期字符串新加属性
     */
    private String byTimeAfter;

    public String getByTimeAfter() {
        return byTimeAfter;
    }

    public void setByTimeAfter(Date time) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String byTimeAfter = formatter.format(time);
        this.byTimeAfter = byTimeAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_order.orderid
     *
     * @return the value of commodity_order.orderid
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_order.orderid
     *
     * @param orderid the value for commodity_order.orderid
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_order.order_no
     *
     * @return the value of commodity_order.order_no
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_order.order_no
     *
     * @param orderNo the value for commodity_order.order_no
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_order.openid
     *
     * @return the value of commodity_order.openid
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_order.openid
     *
     * @param openid the value for commodity_order.openid
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_order.goodsid
     *
     * @return the value of commodity_order.goodsid
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_order.goodsid
     *
     * @param goodsid the value for commodity_order.goodsid
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_order.order_amount_total
     *
     * @return the value of commodity_order.order_amount_total
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public Double getOrderAmountTotal() {
        return orderAmountTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_order.order_amount_total
     *
     * @param orderAmountTotal the value for commodity_order.order_amount_total
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public void setOrderAmountTotal(Double orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_order.by_time
     *重写获取时间的方法转换为正常显示日期
     * @return the value of commodity_order.by_time
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public Date getByTime() {

        return byTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_order.by_time
     *
     * @param byTime the value for commodity_order.by_time
     *
     * @mbggenerated Mon Jun 29 20:37:39 CST 2020
     */
    public void setByTime(Date byTime) {
        this.byTime = byTime;
    }

}