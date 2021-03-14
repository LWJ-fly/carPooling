/*
 Navicat Premium Data Transfer

 Source Server         : aliyun_mysql
 Source Server Type    : MySQL
 Source Server Version : 50637
 Source Host           : localhost:3306
 Source Schema         : carpooling

 Target Server Type    : MySQL
 Target Server Version : 50637
 File Encoding         : 65001

 Date: 14/03/2021 19:10:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for carpoolinginfo
-- ----------------------------
DROP TABLE IF EXISTS `carpoolinginfo`;
CREATE TABLE `carpoolinginfo`  (
  `carID` int(20) NOT NULL COMMENT '拼车的ID',
  `userID` int(20) NULL DEFAULT NULL COMMENT '用户的ID，和拼车ID共同组成ID',
  `userIDS` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '加入拼车的ID，由，分割每个用户',
  `getNum` int(10) NULL DEFAULT NULL COMMENT '需要拼车的人数，根据拼车人数变动',
  `totalNum` int(10) NULL DEFAULT NULL COMMENT '拼车的总人数，总人数不变',
  `StartTime` datetime(6) NULL DEFAULT NULL COMMENT '发起拼车的时间',
  `endTime` datetime(6) NULL DEFAULT NULL COMMENT '结束拼车的时间，1、到时间没有筹够人数。2、提前筹够人数',
  `readyTime` datetime(6) NULL DEFAULT NULL COMMENT '开始出发的时间',
  `GoTime` datetime(6) NULL DEFAULT NULL COMMENT '最晚出发的时间',
  `readyPlace` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '拼车的始发地',
  `GoPlace` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '拼车的目的地',
  `carpoolinglimit` int(10) NULL DEFAULT NULL COMMENT '拼车的限制，1、2、4、8制度',
  `carpoolingstate` int(10) NULL DEFAULT NULL COMMENT '拼车状态，拼成or未拼成',
  `LeaveNum` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户历史的记录，被请出的or自动离开的',
  PRIMARY KEY (`carID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '拼车的信息，每次发起的拼车都可以在这里查看' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uinacarinfo
-- ----------------------------
DROP TABLE IF EXISTS `uinacarinfo`;
CREATE TABLE `uinacarinfo`  (
  `carID` int(11) NOT NULL COMMENT '用户拼车的ID，唯一的拼车表示',
  `userID` int(11) NOT NULL COMMENT '用户的个人拼车信息',
  `inCarMsg` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '个人在拼车中留下的信息',
  `joinTime` datetime(0) NULL DEFAULT NULL COMMENT '加入拼车时的时间',
  `carState` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '这次拼车的状态，0 加入拼车、1 退出拼车、2 拼车成功、3 被请出拼车、4这次拼车没有去',
  `outInfo` int(10) NULL DEFAULT NULL COMMENT '用户暴露的信息，1、2、4、8……',
  `QQNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户暴露的QQ账号，没有则为空',
  `WXNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户暴露的微信账号，没有则为空',
  `phoneNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户暴露的手机号账号，没有则为空',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用来通知用户的邮箱，没有则为空',
  PRIMARY KEY (`carID`, `userID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '用户的拼车信息，保存用户的每次拼车信息，主键由个人ID与拼车ID组合而成' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uinfo
-- ----------------------------
DROP TABLE IF EXISTS `uinfo`;
CREATE TABLE `uinfo`  (
  `userID` int(20) NOT NULL COMMENT '用户的唯一字段',
  `QQNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户暴露的QQ账号',
  `WXNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户暴露的微信账号',
  `phoneNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户暴露的手机号',
  `tallMail` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '需要通知的邮箱',
  `URealName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户的真实姓名',
  `UNickname` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户的昵称',
  `sex` int(2) NULL DEFAULT NULL COMMENT '用户的性别，男or女，男1 女0',
  `outInfo` int(2) NULL DEFAULT NULL COMMENT '用户选择暴露的信息',
  `signature` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户的个人说明',
  `UWallet` double(255, 0) NULL DEFAULT NULL COMMENT '用户的钱包',
  `UCredibility` int(10) NULL DEFAULT NULL COMMENT '用户的信誉值，用来记录用户的信誉',
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '保存用户的信息，保存用户常用的信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ulogin
-- ----------------------------
DROP TABLE IF EXISTS `ulogin`;
CREATE TABLE `ulogin`  (
  `userID` int(20) NOT NULL COMMENT '用户的ID 唯一标识',
  `qqLogin` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'QQ登录，如果用户授权则绑定，不授权则为空',
  `wxLogin` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '微信登录，如果用户授权则绑定，不授权则为空',
  `zfbLogin` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '支付宝登录，如果用户授权则绑定，不授权则为空',
  `tbLogin` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '淘宝登录，如果用户授权则绑定，不授权则为空',
  `zhLogin` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '本地账号登录',
  `zhPwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '本地密码登录',
  `usable` int(5) NOT NULL COMMENT '是否可用，1 可用，0不可用',
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '用户登录的字段，只保存用户登录的信息' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
