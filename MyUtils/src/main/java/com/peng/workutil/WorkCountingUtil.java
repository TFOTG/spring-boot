package com.peng.workutil;

import com.alibaba.fastjson.JSON;
import com.elong.common.util.StringUtils;
import com.peng.utilbo.AttendanceBo;
import com.peng.utilbo.GetAttendanceInfoResponse;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 计算工时工具类
 */
public class WorkCountingUtil {



    public static void main(String[] args) throws ParseException {
        //数据来源是ioa的出勤日志汇总
        String json="{\"Success\":true,\"Message\":\"\\u003cspan\\u003e【2020-09-28至2020-10-04，已出勤工时 \\u003cspan style = \\u0027color:#ff7800;font-weight:bold;\\u0027\\u003e0\\u003c/span\\u003e 小时，距离满勤还有 \\u003cspan style = \\u0027color:#ff7800;font-weight:bold;\\u0027\\u003e27\\u003c/span\\u003e 小时】\\u003c/span\\u003e\",\"Code\":3,\"Total\":0,\"ReturnValue\":[{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":null,\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":null,\"Today\":false},{\"Day\":\"1日\",\"CreditCardData\":\"08:47-09:05-18:53-18:59\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时12分钟\",\"Today\":false},{\"Day\":\"2日\",\"CreditCardData\":\"09:07-09:29-18:59-19:00-19:01\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：9小时54分钟\",\"Today\":false},{\"Day\":\"3日\",\"CreditCardData\":\"08:58-08:59-18:56-18:59\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时\",\"Today\":false},{\"Day\":\"4日\",\"CreditCardData\":\"08:58-09:20-18:58-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时\",\"Today\":false},{\"Day\":\"5日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"6日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"7日\",\"CreditCardData\":\"08:49-18:56-19:00-19:01\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时12分钟\",\"Today\":false},{\"Day\":\"8日\",\"CreditCardData\":\"08:47-18:59\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时12分钟\",\"Today\":false},{\"Day\":\"9日\",\"CreditCardData\":\"08:38-08:39-18:57-18:59-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时24分钟\",\"Today\":false},{\"Day\":\"10日\",\"CreditCardData\":\"08:48-08:49-18:17-18:57-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时12分钟\",\"Today\":false},{\"Day\":\"11日\",\"CreditCardData\":\"09:00-18:47-18:59-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时\",\"Today\":false},{\"Day\":\"12日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"13日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"14日\",\"CreditCardData\":\"08:59-09:19-18:58-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时\",\"Today\":false},{\"Day\":\"15日\",\"CreditCardData\":\"08:48-08:49-18:56-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时12分钟\",\"Today\":false},{\"Day\":\"16日\",\"CreditCardData\":\"08:59-09:00-17:47-18:56-18:59-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时\",\"Today\":false},{\"Day\":\"17日\",\"CreditCardData\":\"08:58-08:59-18:58-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时\",\"Today\":false},{\"Day\":\"18日\",\"CreditCardData\":\"08:48-08:49-18:58-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时12分钟\",\"Today\":false},{\"Day\":\"19日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"20日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"21日\",\"CreditCardData\":\"08:47-09:05-10:25-18:56-18:59-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时12分钟\",\"Today\":false},{\"Day\":\"22日\",\"CreditCardData\":\"08:37-08:55-18:59-19:00-19:01\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时24分钟\",\"Today\":false},{\"Day\":\"23日\",\"CreditCardData\":\"08:59-09:00-18:58-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时\",\"Today\":false},{\"Day\":\"24日\",\"CreditCardData\":\"08:38-08:39-18:57-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时24分钟\",\"Today\":false},{\"Day\":\"25日\",\"CreditCardData\":\"08:38-08:54-18:55-18:57-19:00\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时24分钟\",\"Today\":false},{\"Day\":\"26日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"27日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"年假：09:00-18:00\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：9小时\",\"Today\":false},{\"Day\":\"28日\",\"CreditCardData\":\"09:28\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":true},{\"Day\":\"29日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"30日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false}]}";
        GetAttendanceInfoResponse response= JSON.parseObject(json,GetAttendanceInfoResponse.class);
        if(response.getSuccess()){
            double totalHour=0;
            int totalDays=0;
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
            String specialDate="32日";
            double specialHour=20;
            Calendar ca = Calendar.getInstance();
            String today=ca.get(Calendar.DATE)+"日";

            for (AttendanceBo attendanceBo : response.getReturnValue()) {
                if(StringUtils.isBlank(attendanceBo.getCreditCardData())||today.equals(attendanceBo.getDay())){
                    continue;
                }
                String[] creditCardDataArray=attendanceBo.getCreditCardData().split("-");
                String beginTime=creditCardDataArray[0];
                String endTime=creditCardDataArray[creditCardDataArray.length-1];
                double hourTen =  (sdf.parse(endTime).getTime()-sdf.parse(beginTime).getTime())/(1000 * 60 *6);
                //可以保留精度
                double hours=hourTen/10;
                if(specialDate.equals(attendanceBo.getDay())){
                    System.out.println("specialDate："+attendanceBo.getDay());
                    hours=specialHour;
                }
                System.out.println(attendanceBo.getDay()+": "+beginTime+"——"+endTime+" 工时:"+hours);
                totalHour+=hours;

                totalDays++;
            }

            BigDecimal avgHour = new BigDecimal(totalHour/totalDays).setScale(2, RoundingMode.UP);

            System.out.println("___________________________________");
            System.out.println("总工时："+totalHour);
            System.out.println("工作天数："+totalDays);
            System.out.println("总平均工时："+avgHour.doubleValue());
            double workTime=totalDays*10.6-totalHour;
            if(workTime<=0){
                System.out.println("工时已达标，富余工时："+String.format("%.2f",Math.abs(workTime))+"小时");
            }else {
                System.out.println("工时不达标，需要弥补工时："+String.format("%.0f",workTime)+"小时");
            }
            System.out.println("___________________________________");
        }

    }

}
