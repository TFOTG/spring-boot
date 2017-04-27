package com.elong.hotel.common.config;

import com.alibaba.fastjson.JSON;

/**
 * Created by peng.wang on 17/3/9.
 */
public class ServiceConfig {

    private int getOrderTimeOut;

    private boolean saveRelationLogInDisk;

    private String sendFaxUrl;

    private int sendFaxMaxCount;

    private int firstVerifyUrgenCount;

    private int firstVerifyFaxCount;

    private int firstVerifyUnUrageCount;

    private String citySwitch;

    private String firstIvrBlackList;

    private String reviewIvrBlackList;

    private int verifyInDBTaskInterval;

    private int LaterPayDelayDay;

    private int getHotelInterval;

    private int ebIvrReserveDay;

    private boolean switch4RoomNightDecrease;

    private boolean switch4SendB1Message;


    public boolean getSwitch4RoomNightDecrease() {
        return switch4RoomNightDecrease;
    }

    public void setSwitch4RoomNightDecrease(boolean switch4RoomNightDecrease) {
        this.switch4RoomNightDecrease = switch4RoomNightDecrease;
    }

    public boolean getSwitch4SendB1Message() {
        return switch4SendB1Message;
    }

    public void setSwitch4SendB1Message(boolean switch4SendB1Message) {
        this.switch4SendB1Message = switch4SendB1Message;
    }

    public int getGetOrderTimeOut() {
        return getOrderTimeOut;
    }

    public void setGetOrderTimeOut(int getOrderTimeOut) {
        this.getOrderTimeOut = getOrderTimeOut;
    }

    public boolean getSaveRelationLogInDisk() {
        return saveRelationLogInDisk;
    }

    public void setSaveRelationLogInDisk(boolean saveRelationLogInDisk) {
        this.saveRelationLogInDisk = saveRelationLogInDisk;
    }

    public String getSendFaxUrl() {
        return sendFaxUrl;
    }

    public void setSendFaxUrl(String sendFaxUrl) {
        this.sendFaxUrl = sendFaxUrl;
    }

    public String getFirstIvrBlackList() {
        return firstIvrBlackList;
    }

    public void setFirstIvrBlackList(String firstIvrBlackList) {
        this.firstIvrBlackList = firstIvrBlackList;
    }

    public String getReviewIvrBlackList() {
        return reviewIvrBlackList;
    }

    public void setReviewIvrBlackList(String reviewIvrBlackList) {
        this.reviewIvrBlackList = reviewIvrBlackList;
    }

    public int getLaterPayDelayDay() {
        return LaterPayDelayDay;
    }

    public void setLaterPayDelayDay(int laterPayDelayDay) {
        LaterPayDelayDay = laterPayDelayDay;
    }

    public int getSendFaxMaxCount() {
        return sendFaxMaxCount;
    }

    public void setSendFaxMaxCount(int sendFaxMaxCount) {
        this.sendFaxMaxCount = sendFaxMaxCount;
    }

    public int getGetHotelInterval() {
        return getHotelInterval;
    }

    public void setGetHotelInterval(int getHotelInterval) {
        this.getHotelInterval = getHotelInterval;
    }

    public String getCitySwitch() {
        return citySwitch;
    }

    public void setCitySwitch(String citySwitch) {
        this.citySwitch = citySwitch;
    }

    public int getFirstVerifyUnUrageCount() {
        return firstVerifyUnUrageCount;
    }

    public void setFirstVerifyUnUrageCount(int firstVerifyUnUrageCount) {
        this.firstVerifyUnUrageCount = firstVerifyUnUrageCount;
    }

    public int getFirstVerifyUrgenCount() {
        return firstVerifyUrgenCount;
    }

    public void setFirstVerifyUrgenCount(int firstVerifyUrgenCount) {
        this.firstVerifyUrgenCount = firstVerifyUrgenCount;
    }

    public int getEbIvrReserveDay() {
        return ebIvrReserveDay;
    }

    public void setEbIvrReserveDay(int ebIvrReserveDay) {
        this.ebIvrReserveDay = ebIvrReserveDay;
    }

    public int getVerifyInDBTaskInterval() {
        return verifyInDBTaskInterval;
    }

    public void setVerifyInDBTaskInterval(int verifyInDBTaskInterval) {
        this.verifyInDBTaskInterval = verifyInDBTaskInterval;
    }

    public int getFirstVerifyFaxCount() {
        return firstVerifyFaxCount;
    }

    public void setFirstVerifyFaxCount(int firstVerifyFaxCount) {
        this.firstVerifyFaxCount = firstVerifyFaxCount;
    }

    public static void main(String[] args) {
        ServiceConfig config=new ServiceConfig();
        config.setGetOrderTimeOut(1000);
        config.setSaveRelationLogInDisk(false);
        config.setSendFaxUrl("http://HApiHtl.vip.elong.com:9000/WCF/com.eLong.Hotel.Notice.Services/FaxService");
        config.setSendFaxMaxCount(3);
        config.setCitySwitch("1");
        config.setFirstIvrBlackList("50201063,91739542,91739130,91721272,91622752,91605159,91585525,91566584,91560050,91559374,91558595,91558517,91557300,91555948,91551827,91541316,91527608,91527034,91525495,91523346,91522833,91520095,91518786,91517357,91517051,91516194,91515211,91512902,91455296,91452334,91451416,91450110,91441251,91435335,91429623,91429327,91418763,91417452,91405031,91315123,91279227,91256155,91243416,91234237,91234017,91229509,91220951,91181598,91171174,91170219,91163073,91158952,91158762,91155920,91124301,91122025,91117181,91117050,91111001,91107662,91107275,91106621,91103155,91102536,91099715,91098339,91086772,91086473,91085671,91083646,91071863,91067733,91063995,91056088,91050596,91048547,91046599,91045875,91045414,91043675,91038963,91036056,91027236,91024875,91023005,91012553,91006598,91005851,91005466,91004403,91002459,91000182,90990286,90985782,90985515,90985357,90984781,90982369,90979414,90979356,90978757,90949506,90949404,90945432,90944114,90942813,90939715,90939589,90939001,90937431,90922810,90920255,90898239,90888536,90884990,90884208,90883491,90883137,90882907,90882402,90882292,90881973,90881595,90802961,90723767,90722851,90698627,90683794,90679508,90679376,90678842,90678640,90678588,90678386,90677879,90670930,90655840,90649742,90611590,90609501,90608865,90575236,90564796,90561160,90548560,90504511,90202346,90188906,90183886,90182515,90053664,60101074,52005021,41207009,41152001,40201151,40101890,30901243,30901074,30901070,30201194,21212003,21201113,21143002,20301007,12401005,10201270,10101181,02801011,02701030,02501023,02202055,02102147,02102102,01615204,01612030,01611001,01603088,01601137,01520047,01507006,01401044,01251005,01201348,01111010,01105138,01103009,01101209,01101155,01012019,01001435,00901049,00810005,00809024,00802101,00802040,00702074,00605036,00512024,00501098,00301091,00201812,00201326,00101651,00101129,90799822");
        config.setReviewIvrBlackList("00,");
        config.setLaterPayDelayDay(2);
        config.setGetHotelInterval(5);
        config.setSwitch4RoomNightDecrease(true);
        config.setSwitch4SendB1Message(true);
        System.out.println(JSON.toJSONString(config));
    }

}
