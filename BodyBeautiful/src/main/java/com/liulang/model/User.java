package com.liulang.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_wechart_user.userid
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_wechart_user.openid
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_wechart_user.nickname
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_wechart_user.registert_time
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    private Date registertTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_wechart_user.userid
     *
     * @return the value of user_wechart_user.userid
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_wechart_user.userid
     *
     * @param userid the value for user_wechart_user.userid
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_wechart_user.openid
     *
     * @return the value of user_wechart_user.openid
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_wechart_user.openid
     *
     * @param openid the value for user_wechart_user.openid
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_wechart_user.nickname
     *
     * @return the value of user_wechart_user.nickname
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_wechart_user.nickname
     *
     * @param nickname the value for user_wechart_user.nickname
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_wechart_user.registert_time
     *
     * @return the value of user_wechart_user.registert_time
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    public Date getRegistertTime() {
        return registertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_wechart_user.registert_time
     *
     * @param registertTime the value for user_wechart_user.registert_time
     *
     * @mbggenerated Wed Jul 01 10:35:04 CST 2020
     */
    public void setRegistertTime(Date registertTime) {
        this.registertTime = registertTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", registertTime=" + registertTime +
                '}';
    }
}