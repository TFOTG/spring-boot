package com.elong.hotel.common.util;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.elong.common.http.HttpMethodUtil;
import com.elong.common.http.HttpUtil;
import com.elong.common.http.model.HttpResult;
import com.elong.common.util.FileUtil;
import com.elong.hotel.mis.common.model.MisUser;
import com.elong.hotel.mis.common.model.response.MisUserResponse;

public class _MisUserUtil
{
  private static String misSessionUrl;

  public static MisUser getCurrentMisUser(HttpServletRequest request)
  {
    MisUser misUser = null;
    /**
     * 测试用户
     */
    if (request.getParameter("debug")!=null) {//
    	MisUser testUser = new MisUser();;
    	testUser.setCti_groupId("1");
    	testUser.setLoginName("测试");
    	testUser.setUserName("测试帐号");
		return testUser;
    }
    
    HttpSession session = request.getSession();
    misUser = (MisUser)session.getAttribute("misUser");
    if (misUser != null) return misUser;

    Cookie[] cookies = request.getCookies();
    if (null == cookies) {
      return null;
    }
    Cookie cookie = null;
    for (Cookie temp : cookies) {
      if (temp.getName().equals("sid")) {
        cookie = temp;
        break;
      }
    }
    if (null == cookie) {
      return null;
    }
    misUser = getCurrentMisUser(cookie.getValue());
    if (misUser == null) return null;
    session.setAttribute("misUser", misUser);
    return misUser;
  }

  private static MisUser getCurrentMisUser(String sid) {
    MisUser misUser = null;
    String url = misSessionUrl + "?cookie=" + sid;
    HttpUtil http = HttpUtil.getInstance();
    http.setMethod(HttpMethodUtil.getGetMethod(url));
    HttpResult result = http.getHttpResult();
    MisUserResponse misUserResponse = (MisUserResponse)JSON.parseObject(result.getContent(), MisUserResponse.class);
    if (null == misUserResponse) {
      return null;
    }
    misUser = misUserResponse.getMisUser();
    return misUser;
  }

  public static MisUser getCurrentMisUser2(HttpServletRequest request) {
    MisUser misUser = null;
    HttpSession session = request.getSession();

    Cookie[] cookies = request.getCookies();
    if (null == cookies) {
      return null;
    }
    Cookie cookie = null;
    for (Cookie temp : cookies) {
      if (temp.getName().equals("sid")) {
        cookie = temp;
        break;
      }
    }
    if (null == cookie) {
      return null;
    }
    String cc = cookie.getValue();
    misUser = getCurrentMisUser(cc);
    if (misUser == null) return null;
    session.setAttribute("misUser", misUser);
    return misUser;
  }

  static
  {
    FileUtil fileUtil = new FileUtil("/conf/custom/notenv/MisUser.properties");
    misSessionUrl = fileUtil.getProperties("misSessionUrl");
    if ((misSessionUrl == null) || (misSessionUrl.matches("\\s"))) System.out.println("请在/conf/custom/notenv/MisUser.properties中配置misSessionUrl！");
  }
}
