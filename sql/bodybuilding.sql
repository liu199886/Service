/*
Navicat MySQL Data Transfer

Source Server         : sql1
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : bodybuilding

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-07-01 17:34:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `commodity_order`
-- ----------------------------
DROP TABLE IF EXISTS `commodity_order`;
CREATE TABLE `commodity_order` (
  `orderid` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增长主键',
  `order_no` varchar(20) NOT NULL COMMENT '订单单号',
  `openid` varchar(50) NOT NULL COMMENT '关联的用户id',
  `goodsid` int(11) NOT NULL COMMENT '购买商品id',
  `order_amount_total` double NOT NULL COMMENT '订单金额',
  `by_time` datetime NOT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity_order
-- ----------------------------
INSERT INTO `commodity_order` VALUES ('1', '1', '111', '3', '11', '2020-06-29 14:21:43');

-- ----------------------------
-- Table structure for `course_goods`
-- ----------------------------
DROP TABLE IF EXISTS `course_goods`;
CREATE TABLE `course_goods` (
  `courseid` int(11) NOT NULL AUTO_INCREMENT,
  `seq` int(2) NOT NULL COMMENT '教程序号',
  `description` varchar(50) DEFAULT NULL COMMENT '描述',
  `url` varchar(50) DEFAULT NULL COMMENT '图片或者视频地址',
  `detailed` text COMMENT '详细信息',
  PRIMARY KEY (`courseid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_goods
-- ----------------------------
INSERT INTO `course_goods` VALUES ('1', '1', '第一节课', 'adasda', '这是第一节课');
INSERT INTO `course_goods` VALUES ('2', '2', '第二节课', 'asdasd', '这是第二节课');
INSERT INTO `course_goods` VALUES ('3', '3', '第三节课', 'asdasd', '这是第三节课');
INSERT INTO `course_goods` VALUES ('4', '4', '第四节课', 'uyyuu', '这是第四节课');

-- ----------------------------
-- Table structure for `course_subitem_goods`
-- ----------------------------
DROP TABLE IF EXISTS `course_subitem_goods`;
CREATE TABLE `course_subitem_goods` (
  `course_sub_id` int(11) NOT NULL AUTO_INCREMENT,
  `courseid` int(11) NOT NULL COMMENT '父表course的主键id',
  `seq` int(2) NOT NULL COMMENT '自定义顺序',
  `subitem` varchar(50) DEFAULT '' COMMENT '课程描述',
  `subitem_title` varchar(20) DEFAULT NULL COMMENT '课程标题',
  `video_url` varchar(50) NOT NULL COMMENT '视频链接',
  PRIMARY KEY (`course_sub_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_subitem_goods
-- ----------------------------
INSERT INTO `course_subitem_goods` VALUES ('1', '1', '1', '哈哈哈', '第一小节', '123');
INSERT INTO `course_subitem_goods` VALUES ('2', '1', '2', '嘻嘻嘻', '第二小节', '1231231');

-- ----------------------------
-- Table structure for `user_wechart_user`
-- ----------------------------
DROP TABLE IF EXISTS `user_wechart_user`;
CREATE TABLE `user_wechart_user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `openid` varchar(50) NOT NULL COMMENT '微信id',
  `nickname` varchar(10) NOT NULL,
  `registert_time` date NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_wechart_user
-- ----------------------------
INSERT INTO `user_wechart_user` VALUES ('1', '111', '111', '2020-07-01');
INSERT INTO `user_wechart_user` VALUES ('2', 'adakdkad', '法外狂徒张三', '2020-07-01');
INSERT INTO `user_wechart_user` VALUES ('3', 'adakdkad', '法外狂徒张三', '2020-07-01');
INSERT INTO `user_wechart_user` VALUES ('4', '65464646', '赵四', '2020-07-01');
INSERT INTO `user_wechart_user` VALUES ('5', 'otxDV5Lk7ln_e2iJyTvLAT_nPEdw', '', '2020-07-01');
INSERT INTO `user_wechart_user` VALUES ('6', 'otxDV5BxuaDypO3b9oaahfqESXdI', '叮咚', '2020-07-01');
