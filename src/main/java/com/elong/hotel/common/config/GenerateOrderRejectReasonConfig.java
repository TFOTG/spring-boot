package com.elong.hotel.common.config;

import com.elong.common.util.JsonUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @outhor jianjun.wang
 * @create 2017-12-20 下午3:23
 * 订单特满原因选项初始化类 请勿修改
 */

public class GenerateOrderRejectReasonConfig {
    public static void main(String[] args) {

        //满房O
        List<Map<String, String>> fullRoom = new ArrayList<Map<String, String>>();
        Map<String, String> O1 = new HashMap<String, String>();
        O1.put("ostatus", "O1");
        O1.put("sendsms", "N");
        O1.put("detail", "房间满");
        O1.put("id", "1");
        Map<String, String> O2 = new HashMap<String, String>();
        O2.put("ostatus", "O2");
        O2.put("sendsms", "N");
        O2.put("detail", "联系不上");
        O2.put("id", "2");
        Map<String, String> O3 = new HashMap<String, String>();
        O3.put("ostatus", "O3");
        O3.put("sendsms", "N");
        O3.put("detail", "号码无效");
        O3.put("id", "3");
        Map<String, String> O4 = new HashMap<String, String>();
        O4.put("ostatus", "O4");
        O4.put("sendsms", "N");
        O4.put("detail", "不接线下");
        O4.put("id", "4");
        Map<String, String> O5 = new HashMap<String, String>();
        O5.put("ostatus", "O5");
        O5.put("sendsms", "N");
        O5.put("detail", "不合作");
        O5.put("id", "5");
        Map<String, String> O6 = new HashMap<String, String>();
        O6.put("ostatus", "O6");
        O6.put("sendsms", "N");
        O6.put("detail", "eb满房");
        O6.put("id", "6");
        fullRoom.add(O1);
        fullRoom.add(O2);
        fullRoom.add(O3);
        fullRoom.add(O4);
        fullRoom.add(O5);
        fullRoom.add(O6);

        //变价G
        List<Map<String, String>> changePrice = new ArrayList<Map<String, String>>();
        Map<String, String> G1 = new HashMap<String, String>();
        G1.put("ostatus", "G1");
        G1.put("sendsms", "N");
        G1.put("detail", "变价");
        G1.put("id", "7");
        Map<String, String> G2 = new HashMap<String, String>();
        G2.put("ostatus", "G2");
        G2.put("sendsms", "N");
        G2.put("detail", "暂不接受预订");
        G2.put("id", "8");
        Map<String, String> G3 = new HashMap<String, String>();
        G3.put("ostatus", "G3");
        G3.put("sendsms", "N");
        G3.put("detail", "价格未出");
        G3.put("id", "9");
        changePrice.add(G1);
        changePrice.add(G2);
        changePrice.add(G3);

        //需担保U
        List<Map<String, String>> needGuarantee = new ArrayList<Map<String, String>>();
        Map<String, String> U1 = new HashMap<String, String>();
        U1.put("ostatus", "U1");
        U1.put("messageToguest", "[艺龙]订单***********酒店通知需信用卡担保,同意请等待客服与您联系,取消此单回复BY**,有疑问请致电4009333333-1");
        U1.put("sendsms", "Y");
        U1.put("staffToguest", "需信用卡担保,同意");
        U1.put("detail", "需担保");
        U1.put("id", "10");
        U1.put("messageForview", "酒店临时通知需要信用卡担保,同意,请等待客服30分钟联系您处理;取消此单,请点击“取消订单”");
        Map<String, String> U2 = new HashMap<String, String>();
        U2.put("ostatus", "U2");
        U2.put("sendsms", "N");
        U2.put("detail", "其他");
        U2.put("id", "11");
        needGuarantee.add(U1);
        needGuarantee.add(U2);

        //特殊满房U
        List<Map<String, String>> specialFullroom = new ArrayList<Map<String, String>>();
        Map<String, String> U3 = new HashMap<String, String>();
        U3.put("ostatus", "U3");
        U3.put("messageToguest", "[艺龙]订单***********酒店通知有重复预订,无重复预订回复BG**,取消此单回复BY**,或登录app-我的-我的订单操作");
        U3.put("sendsms", "Y");
        U3.put("staffToguest", "您有重复预订,无重复预订");
        U3.put("detail", "重复预订");
        U3.put("id", "12");
        U3.put("messageForview", "酒店临时通知您有重复预订,无重复预订,请即点击“同意安排”;取消此单,请点击“取消订单”");
        Map<String, String> U4 = new HashMap<String, String>();
        U4.put("ostatus", "U4");
        U4.put("messageToguest", "[艺龙]订单***********酒店通知***回复BG**,取消此单回复BY**,或登录app-我的-我的订单操作");
        U4.put("sendsms", "Y");
        U4.put("staffToguest", "您***预订错误,未预订错误");
        U4.put("detail", "客人订错***");
        U4.put("id", "13");
        U4.put("messageForview", "酒店临时通知***,请即点击“同意安排”;取消此单,请点击“取消订单”");
        Map<String, String> U5 = new HashMap<String, String>();
        U5.put("ostatus", "U5");
        U5.put("messageToguest", "[艺龙]订单***********酒店告知您曾致电酒店取消此单,保留此单回复BG**,取消此订单回复BY**,或登录app-我的-我的订单操作");
        U5.put("sendsms", "Y");
        U5.put("staffToguest", "您曾致电酒店取消此单,保留此单");
        U5.put("detail", "核实客人取消");
        U5.put("id", "14");
        U5.put("messageForview", "酒店临时通知您有订单需要取消,保留订单,请即点击“同意安排”;取消此单,请点击“取消订单”");
        Map<String, String> U6 = new HashMap<String, String>();
        U6.put("ostatus", "U6");
        U6.put("messageToguest", "[艺龙]订单***********酒店通知***回复BG**,取消此单回复BY**,如有疑问请致电4009333333-1");
        U6.put("sendsms", "Y");
        U6.put("staffToguest", "因***可能会影响入住,同意");
        U6.put("detail", "因****可能会影响入住");
        U6.put("id", "15");
        U6.put("messageForview", "酒店临时通知***,同意,请即点击“同意安排”;取消此单,请点击“取消订单”");
        Map<String, String> U7 = new HashMap<String, String>();
        U7.put("ostatus", "U7");
        U7.put("messageToguest", "[艺龙]订单***********酒店正在为您协调房间,同意等待回复BG**,取消此单回复BY**,或登录app-我的-我的订单操作");
        U7.put("sendsms", "Y");
        U7.put("staffToguest", "正在为您协调房间,同意等待");
        U7.put("detail", "马上到店不处理");
        U7.put("id", "16");
        U7.put("messageForview", "酒店临时通知正在为您协调房间,同意等待,请即点击“同意安排”;取消此单,请点击“取消订单”");
        Map<String, String> U8 = new HashMap<String, String>();
        U8.put("ostatus", "U8");
        U8.put("messageToguest", "[艺龙]订单***********酒店通知***回复BG**,取消此单回复BY**,如有疑问请致电4009333333-1");
        U8.put("sendsms", "Y");
        U8.put("staffToguest", "可为您免费升级到***,同意");
        U8.put("detail", "可为您免费升级到****");
        U8.put("id", "17");
        U8.put("messageForview", "酒店临时通知***,请即点击“同意安排”;取消此单,请点击“取消订单”");
        Map<String, String> U9 = new HashMap<String, String>();
        U9.put("ostatus", "U9");
        U9.put("sendsms", "N");
        U9.put("detail", "其他");
        U9.put("id", "18");
        specialFullroom.add(U3);
        specialFullroom.add(U4);
        specialFullroom.add(U5);
        specialFullroom.add(U6);
        specialFullroom.add(U7);
        specialFullroom.add(U8);
        specialFullroom.add(U9);

        //一级菜单
        List<Map<String, String>> menuonenames = new ArrayList<Map<String, String>>();
        Map<String, String> O = new HashMap<String, String>();
        O.put("orderstatus", "O");
        O.put("name", "满房");
        O.put("key", "fullRoom");
        Map<String, String> G = new HashMap<String, String>();
        G.put("orderstatus", "G");
        G.put("name", "变价");
        G.put("key", "changePrice");
        Map<String, String> U = new HashMap<String, String>();
        U.put("orderstatus", "U");
        U.put("name", "需担保");
        U.put("key", "needGuarantee");
        Map<String, String> Uw = new HashMap<String, String>();
        Uw.put("orderstatus", "U");
        Uw.put("name", "特殊满房");
        Uw.put("key", "specialFullroom");
        menuonenames.add(O);
        menuonenames.add(G);
        menuonenames.add(U);
        menuonenames.add(Uw);

        Map<String, Object> mapMeum = new HashMap<String, Object>();
        mapMeum.put("fullRoom",fullRoom );
        mapMeum.put("changePrice", changePrice);
        mapMeum.put("needGuarantee", needGuarantee);
        mapMeum.put("specialFullroom", specialFullroom);
        mapMeum.put("menuonenames", menuonenames);

        System.out.println(JsonUtil.BeanToJson(mapMeum));
    }
}