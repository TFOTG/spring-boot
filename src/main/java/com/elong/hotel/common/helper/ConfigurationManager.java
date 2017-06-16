package com.elong.hotel.common.helper;

import com.elong.hotswitch.client.Exception.HotSwitchClientException;
import com.elong.hotswitch.client.HotSwitchConfigHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ConfigurationManager
 *
 * @author yangboyu
 * @Title: ConfigurationManager
 * @Description:
 * @date 2014年12月28日 下午1:38:25
 */
@Component
public class ConfigurationManager {

    private static HotSwitchConfigHelper hotSwitchConfigHelper;

    @Autowired
    public void setHotSwitchConfigHelper(HotSwitchConfigHelper hotSwitchConfigHelper) {
        ConfigurationManager.hotSwitchConfigHelper = hotSwitchConfigHelper;
    }

    /**
     * 获取HotSwitchConfig,该方法不要作为类静态变量引用
     *
     * @param configName
     * @param type
     * @param <T>
     * @return
     * @throws HotSwitchClientException
     */
    public static <T> T getHotSwitchConfig(String configName, Class<T> type) {
        try {
            T config = hotSwitchConfigHelper.GetConfigValue(configName, type);
            return config;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取HotSwitchConfig，如未获取到则返回默认值
     * @param configName
     * @param type
     * @param defaultValue
     * @param <T>
     * @return
     */
    public static <T> T getHotSwitchConfig(String configName, Class<T> type,T defaultValue) {
        try {
            T config = hotSwitchConfigHelper.GetConfigValue(configName, type,defaultValue);
            return config;
        } catch (Exception e) {
            return null;
        }
    }



    public static boolean updateConfigValue(String key,String value,String modifyUser){
    	try {
			return hotSwitchConfigHelper.UpdateBaseConfigValue(key, value, modifyUser);
		} catch (HotSwitchClientException e) {
			return false;
		}
    }
}
