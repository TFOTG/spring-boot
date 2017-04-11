package com.elong.hotel.common.helper;

import com.elong.hotswitch.client.Exception.HotSwitchClientException;
import com.elong.hotswitch.client.HotSwitchConfigHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;


/**
 * 
 * ConfigurationManager
 * 
 * @Title: ConfigurationManager
 * @Description: TODO
 * @author yangboyu
 * @date 2014年12月28日 下午1:38:25
 * 
 */
@Component
public class ConfigurationManager {

    private static HotSwitchConfigHelper hotSwitchConfigHelper;

  /**
   * AppSettings
   * 
   * @param key key
   * @param confName confName
   * @return string
   */
  public static String appSettings(String key, String confName) {
    String result = "";

    ResourceBundle bundle = ResourceBundle.getBundle(confName);

    result = bundle.getString(key);

    return result;
  }
/**
 * 
 * (方法说明描述)验证文件格式 
 *
 * @param key
 * @return
 */
  public static boolean Ext(String key) {
    Set<String> fileExt = new HashSet<String>();
    String ss = appSettings("file.ext", "conf/custom/env/attachment");
    fileExt = new HashSet<String>(Arrays.asList(ss.split(",")));
    return fileExt.contains(key);
  }
  /**
   * 
   * (方法说明描述)比较文件大小 
   *
   * @param realSize
   * @return
   */
  public static boolean validateSize(long realSize) {
	String ss = appSettings("file.maxsize", "conf/custom/env/attachment");
	long size = Long.valueOf(ss);
	if (size>=realSize) {
		return true;
	}
	return false;
  }

    @Autowired
    public void setHotSwitchConfigHelper(HotSwitchConfigHelper hotSwitchConfigHelper) {
        ConfigurationManager.hotSwitchConfigHelper = hotSwitchConfigHelper;
    }

    /**
     * 获取HotSwitchConfig,该方法不要作为类静态变量引用
     * @param configName
     * @param type
     * @param <T>
     * @return
     * @throws HotSwitchClientException
     */
    public static <T> T getHotSwitchConfig(String configName,Class<T> type) {
        try {
            T config=hotSwitchConfigHelper.GetConfigValue(configName, type);
            return config;
        } catch (Exception e) {
            return null;
        }
    }

}
