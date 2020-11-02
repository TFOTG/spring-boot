package com.peng.jsonutil;

import com.alibaba.fastjson.JSON;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by peng.wang on 2019/9/27.
 */
public class JSONUtil {

    public static void main(String[] args) {
        String json="{\"citySwitch\":1,\"autoNoticeGroupSendMailProxyIds\":\"AP0048751,AP0049132,AP49814,AP49829,ELONG,ELONG.COM400,HR-ELONG,VP-ELONG,AP0001601,AP0027794,AP50029,A06,AP0011893,ZD,AP-4004230,NB57N106,AP0038810,AP0036332,DL-北京其他,MOBILE,AP0019611,SINAFTBZAIXIANFAKA,AP0047450,AP50390,AP0047831\",\"groupForJJ\":107,\"executorThreads\":10,\"priority4UrgeDistance\":3000,\"notHanledCardNos\":\"\",\"respitedCountUpperLimit\":20,\"normalOrderLimit\":3,\"urgencyOrderLimit\":2,\"refusedCancelNumSearchTimeInterval\":7,\"priority4UrgeMinute\":120,\"switchForTransferred\":0,\"groupSwitchForJJ\":1,\"executorMaxTimeOut\":30,\"executorQueueSize\":500,\"autoNoticeGroupEmailId\":\"106337\",\"switchForRelationHotel\":1,\"supposedProxyIds\":\"AP0022170,AP0019548,AP0015596,AP4004228,AP0019754,AP0017194,AP0037110,AP0037351,AP0022895,AP0020332,AP0020211,AP4052993,AP0024335,AP0017455,AP0043710,AP0001643,AP4000285,AP4000288,AP0023369,AP0016114,A06\",\"ctripOrderPayHisUrl\":\"http://htlint.ctripcorp.com/orderoperate/Order/ViewProcessLog/{ctripOrderId}/elong\",\"autoNoticeGroupSMSId\":\"106303\",\"compensationActivityId\":\"2020017577\",\"examCompensationUrl\":\"http://bonuses-api.vip.elong.com:8086/ly/bonus/rechargeForCommon\",\"operatorIp\":\"10.172.7.44\",\"operatorName\":\"尹雨晴\",\"overSeasProvinceIds\":\"3200,3300,3400\",\"priority4SpecialUrgeMinute\":120,\"examCompensationSwitch\":0,\"operatorTime\":\"2019/09/27 13:41:22\",\"defaultGroupId\":64}";
        Map<String,String> map = JSON.parseObject(json,Map.class);
        Map<String,String> sortMap=JSONUtil.sortMapByKey(map);
        System.out.println(JSON.toJSONString(sortMap));
        for (Map.Entry<String,String> entry : sortMap.entrySet()) {
            System.out.println(entry.getKey());
        }

    }

    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Map<String, String> sortMap = new TreeMap<String, String>(
                new MapKeyComparator());

        sortMap.putAll(map);

        return sortMap;
    }

    static class MapKeyComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {

            return str1.compareTo(str2);
        }
    }
}

