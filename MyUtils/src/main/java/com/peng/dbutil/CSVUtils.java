package com.peng.dbutil;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

/**
 * Created by peng.wang on 2018/1/17.
 */
public class CSVUtils {

    public static void createCSV() throws IOException {
        Map<String, String> prProductLineMap = new HashMap<>();
        Map<String, String> prPayTypeMap = new HashMap<>();

        CsvReader prDicReader = new CsvReader("/Users/admin/Downloads/dic.csv", ',', Charset.forName("UTF-8"));

        while (prDicReader.readRecord()) {
            String[] data = prDicReader.getRawRecord().split(",");
            prProductLineMap.put(data[0], data[1]);
            prPayTypeMap.put(data[0], data[2]);
        }
        prDicReader.close();


        CsvWriter cWriter = new CsvWriter("/Users/admin/Downloads/out.csv", ',', Charset.forName("GBK"));
        //导出表的新表头
        String[] title = new String[]{"prid", "srid", "会员卡号", "会员电话","订单id", "状态", "提交时间","确认时间","赔付金额","pr字典id","产品线","赔付类型"};
        cWriter.writeRecord(title, true);

        String readDataPath="/Users/admin/Downloads/data";
        File filePath = new File(readDataPath);
        // 获得该文件夹内的所有文件
        File[] array = filePath.listFiles();
        for (File file : array) {
            if(file.getName().equals(".DS_Store")){
                continue;
            }
            CsvReader dataReader = new CsvReader(readDataPath+"/"+file.getName(), ',', Charset.forName("UTF-8"));
            int i=1;
            while (dataReader.readRecord()) {
                if(i==1){
                    i++;
                    continue;
                }

                String[] data = dataReader.getRawRecord().split(",");
                String dicId=data[9];
                String[] newDate=new String[12];
                newDate[0]=data[0];
                newDate[1]=data[1];
                newDate[2]=data[2];
                newDate[3]=data[3];
                newDate[4]=data[4];
                newDate[5]=data[5];
                newDate[6]=data[6];
                newDate[7]=data[7];
                newDate[8]=data[8];
                newDate[9]=data[9];
                newDate[10]=prProductLineMap.get(dicId);
                newDate[11]=prPayTypeMap.get(dicId);
                cWriter.writeRecord(newDate, true);
                cWriter.flush();//刷新数据
            }
        }
        cWriter.close();
    }


    public static void createLimitPage(int size,int pageSize) {
        for(int i=0;i<size;i++){
            System.out.println("limit "+(i*pageSize)+","+pageSize+";");
        }
    }


    public static void main(String[] args) throws Exception {

        createCSV();

    }

}
