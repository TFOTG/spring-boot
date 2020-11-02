package com.peng.common;

import com.alibaba.fastjson.JSON;
import com.elong.common.util.StringUtils;
import org.apache.poi.hssf.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by peng.wang on 2018/3/5.
 */
public class POIUtils {

    public static String getCellValue(HSSFCell cell){

        String value="";

        switch(cell.getCellType()){
            case HSSFCell.CELL_TYPE_BOOLEAN:
                value=cell.getBooleanCellValue()+"";
                break;
            case HSSFCell.CELL_TYPE_NUMERIC:
                //先看是否是日期格式
                if(HSSFDateUtil.isCellDateFormatted(cell)){
                    //读取日期格式
                    value=cell.getDateCellValue()+"";
                }else{
                    //读取数字
                    value=cell.getNumericCellValue()+"";
                    if(StringUtils.isNotBlank(value)){
                        String[] a=value.split(".0");
                        if(a.length>0){
                            value=a[0];
                        }
                    }
                }
                break;
            case HSSFCell.CELL_TYPE_FORMULA:
                //读取公式
                value=cell.getCellFormula()+"";
                break;
            case HSSFCell.CELL_TYPE_STRING:
                //读取String
                value=cell.getRichStringCellValue().toString()+"";
                break;
        }

        return value;

    }


    public static void readXlsx(String path) throws IOException {
        InputStream ips=new FileInputStream(path);
        HSSFWorkbook wb=new HSSFWorkbook(ips);
        HSSFSheet sheet=wb.getSheetAt(0);
        List<SrDicMappingRuleBo> list=new ArrayList<SrDicMappingRuleBo>();
        for(int i=1;i<sheet.getPhysicalNumberOfRows();i++){
            HSSFRow row=sheet.getRow(i);
            SrDicMappingRuleBo bo=new SrDicMappingRuleBo();
            bo.setSourceDicId(Integer.valueOf(getCellValue(row.getCell(0))));

            bo.setMappingDicId(Arrays.asList(getCellValue(row.getCell(1)).split("-")));
            bo.setDicType(Integer.valueOf(getCellValue(row.getCell(2))));
            bo.setSourceType(-1);
           list.add(bo);
        }
        System.out.println(JSON.toJSONString(list));
    }


    public static void main(String[] args) throws IOException {
        readXlsx("/Users/peng.wang/Downloads/srdic.xls");
    }

    public static class SrDicMappingRuleBo {

        private Integer sourceDicId;

        private int sourceType;

        private List<String> mappingDicId;

        private int dicType;

        public Integer getSourceDicId() {
            return sourceDicId;
        }

        public void setSourceDicId(Integer sourceDicId) {
            this.sourceDicId = sourceDicId;
        }

        public int getSourceType() {
            return sourceType;
        }

        public void setSourceType(int sourceType) {
            this.sourceType = sourceType;
        }

        public List<String> getMappingDicId() {
            return mappingDicId;
        }

        public void setMappingDicId(List<String> mappingDicId) {
            this.mappingDicId = mappingDicId;
        }

        public int getDicType() {
            return dicType;
        }

        public void setDicType(int dicType) {
            this.dicType = dicType;
        }
    }

}
