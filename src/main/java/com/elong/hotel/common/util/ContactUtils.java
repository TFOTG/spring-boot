package com.elong.hotel.common.util;

import com.elong.hotel.common.helper.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactUtils {

	/**
	 * 
	 * 获取有效的传真号 
	 *
	 * @param FaxNums
	 * @return
	 */
	public static String GetValidFaxNum(String faxNums){
		if(StringUtils.isNotEmpty(faxNums)){
			faxNums = faxNums.replace("－", "-").replace("＋", "+").replace(" ","");  
			String regEx = "(0[0-9]{2,4}[\\-\\+])?([2-9][0-9]{6,8})+([\\-\\+][0-9]{1,4})?";
			Pattern p = Pattern.compile(regEx);
			Matcher mc = p.matcher(faxNums);
			if(mc.find()){
				String validFaxNum=mc.group(0);
				String[] arrayFaxNum = validFaxNum.replace("+", "-").split("-");
				if (arrayFaxNum[0].length() == 3 || arrayFaxNum[0].length() == 4 || arrayFaxNum[0].length() == 5){
					switch (arrayFaxNum.length){
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            validFaxNum = arrayFaxNum[0] +"-"+ arrayFaxNum[1];
                            break;
                        case 3:
                            validFaxNum = arrayFaxNum[0] +"-"+ arrayFaxNum[1] + "+" + arrayFaxNum[2];
                            break;
                    }
                
                 }else{
                     validFaxNum = (arrayFaxNum[0].length() == 8) ? arrayFaxNum[0] : "";
                 }
				 return validFaxNum;
			}
		}
		return "";
	}
	
	/**
	 * 
	 * 获取有效手机号 
	 *
	 * @param telNums
	 * @return
	 */
	public static String getValidTelNum(String telNums){
		
		if(StringUtils.isNotEmpty(telNums)){
			telNums = telNums.replace("－", "-").replace(" ","");
			String regEx = "([0-9]{3,4}(\\-){0,2}[0-9]{7,8})|(\\([0-9]{3,4}\\)(\\-){0,2}[0-9]{7,8})";
			Pattern p = Pattern.compile(regEx);
			Matcher mc = p.matcher(telNums);
			if(mc.find()){
				 return mc.group(0);
			}
		}
		return "";
    }

	/**
	 *
	 * 获取有效手机号
	 *
	 * @param mobileNums
	 * @return
	 */
	public static String getValidMobile(String mobileNums){

		if(StringUtils.isNotEmpty(mobileNums)){
			mobileNums = mobileNums.replace("－", "-").replace(" ","");
			String regEx = "(((([0-9])*(-| )?)?([0-9])*((-| |转)*([0-9]{1,})))|[1-9]\\d*)";
			Pattern p = Pattern.compile(regEx);
			Matcher mc = p.matcher(mobileNums);
			if(mc.find()){
				return mc.group(0);
			}
		}
		return "";
	}

	public static String getValidMobileNum(String mobileNums) {
		if(StringUtils.isNotEmpty(getValidTelNum(mobileNums))){
			String mobile=getValidTelNum(mobileNums);
			if(mobile.startsWith("86")){
				return getValidTelNum(mobile.substring(2, mobile.length()));
			}else{
				return getValidTelNum(mobile);
			}
		}
		return "";
	}

    /**
     *
     * 获取有效邮箱
     *
     * @param telNums
     * @return
     */
    public static String getValidEmail(String email){

        if(StringUtils.isNotEmpty(email)){
            String regEx = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern p = Pattern.compile(regEx);
            Matcher mc = p.matcher(email);
            if(mc.find()){
                return mc.group(0);
            }
        }
        return "";
    }
}