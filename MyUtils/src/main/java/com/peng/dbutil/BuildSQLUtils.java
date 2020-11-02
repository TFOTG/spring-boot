package com.peng.dbutil;

import edu.emory.mathcs.backport.java.util.Arrays;

import java.util.List;

/**
 * @author peng.wang
 * @Description TODO
 * @createTime 2020/2/18
 */
public class BuildSQLUtils {

    public static void main(String[] args) {
        String ids="118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,155,159,160,161,162,163,164,165,166,167,168";
        List<String> idList= Arrays.asList(ids.split(","));
        StringBuilder sql=new StringBuilder("insert into grouptag (groupid,tagkey,tagvalue) values ");
        for (String s : idList) {
            String valueSql="("+s+",'flag','All')";
            sql.append(valueSql).append(",");
        }
        System.out.println(sql.substring(0,sql.length()-1)+";");

    }

}
