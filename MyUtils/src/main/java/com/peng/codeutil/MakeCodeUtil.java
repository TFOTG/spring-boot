package com.peng.codeutil;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;

/**
 * Created by peng.wang on 2018/3/5.
 */
public class MakeCodeUtil {


    private static void createBeanCode4Excel() throws IOException{
        InputStream ips=new FileInputStream("/Users/admin/Downloads/工作簿1.xls");
        HSSFWorkbook wb=new HSSFWorkbook(ips);
        HSSFSheet sheet=wb.getSheetAt(0);
        StringBuilder code= new StringBuilder();
        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++){
            HSSFRow row=sheet.getRow(i);
            code.append("//"+row.getCell(2));
            code.append("\n");
            code.append("private "+row.getCell(1)+" "+row.getCell(0)).append(";");
            code.append("\n");

        }
        FileOutputStream fos = new FileOutputStream("/Users/admin/Downloads/Vo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        osw.write(code.toString());
        osw.flush();
    }

    private static void createCurlCode4Excel() throws IOException{
        InputStream ips=new FileInputStream("/Users/peng.wang/Downloads/curl.xls");
        HSSFWorkbook wb=new HSSFWorkbook(ips);
        HSSFSheet sheet=wb.getSheetAt(0);
        StringBuffer curl=new StringBuffer();
        StringBuffer sql=new StringBuffer();

        for(int i=1;i<sheet.getPhysicalNumberOfRows();i++){

            HSSFRow row=sheet.getRow(i);

            String newFileName=row.getCell(3).toString().trim()+row.getCell(1);
            String sqlStr="update attachment set name='http://api.elongstatic.com/mis/"+newFileName
                    +"',filetype='elongstatic',filesource=2 where id='"+row.getCell(0)+"';\n";
            sql.append(sqlStr);
            curl.append("curl -o /Users/peng.wang/Downloads/sr_attachment/").append(newFileName).
                    append(" http://cs.mis.elong.com:8080/attachment/downloadattachment?id=").append(row.getCell(3).toString()).append("\n");

        }
        buildFile("/Users/peng.wang/Downloads/curl.sh",curl.toString());
        buildFile("/Users/peng.wang/Downloads/attachment.sql",sql.toString());
    }

    private static void buildFile(String url,String data) throws IOException {
        File file=new File(url);
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        osw.write(data);
        osw.flush();
    }

    private static void createJSCode4Excel() throws IOException{
        InputStream ips=new FileInputStream("/Users/admin/Downloads/工作簿1.xls");
        HSSFWorkbook wb=new HSSFWorkbook(ips);
        HSSFSheet sheet=wb.getSheetAt(0);
        StringBuilder code= new StringBuilder();
        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++){
            HSSFRow row=sheet.getRow(i);
            code.append("$(\"#"+row.getCell(0)+"\").html(orderDetailVO."+row.getCell(0)+");");
            code.append("\n");

        }
        FileOutputStream fos = new FileOutputStream("/Users/admin/Downloads/Vo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        osw.write(code.toString());
        osw.flush();
    }

    public static void main(String[] args) throws Exception{
        MakeCodeUtil.createCurlCode4Excel();
    }


}
