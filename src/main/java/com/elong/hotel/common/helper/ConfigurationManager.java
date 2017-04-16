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
 * ConfigurationManager
 *
 * @author yangboyu
 * @Title: ConfigurationManager
 * @Description: TODO
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

}
