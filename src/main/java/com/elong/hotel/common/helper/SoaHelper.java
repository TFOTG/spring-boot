package com.elong.hotel.common.helper;

import com.elong.hotel.common.annotaitions.SoaLogAnnotations;
import com.elong.hotel.common.consts.SOAMethodConst;
import com.elong.hotel.common.enums.CommunicationEventTypeEnum;
import com.elong.hotel.common.exception.SoaException;
import com.elong.hotel.soa.client.main.CommonProxyClient;
import com.elong.hotel.soa.client.main.StandardApiClient;
import com.elong.hotel.soa.client.vo.ResponseInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangpeng
 */
@Component
public class SoaHelper {

    /**
     * post调用方法并记录日志
     * 使用注入方式
     * @param timeout
     * @param logTag         记录communicationevent的tag
     * @param type           communicationevent 类型
     * @return
     * @throws Exception
     * @author zouyufei
     */
    @SoaLogAnnotations
    public String postWithLog(String productName, String serviceName, String methodName, String jsonData, int timeout,String contentType, String logTag, CommunicationEventTypeEnum type) throws Exception {
        return post(productName, serviceName, methodName, jsonData, timeout);
    }

    /**
     * post方法调用SOA，非标准格式
     *
     * @param productName
     * @param serviceName
     * @param methodName
     * @param jsonData
     * @param timeout
     * @return
     * @throws Exception
     */
    public static String post(String productName, String serviceName, String methodName, String jsonData, int timeout) throws SoaException {
        // 参数
        Map<String, Object> optionMap = new HashMap<String, Object>();
        optionMap.put("timeout", timeout);
        // header
        Map<String, String> requestHeaderMap = new HashMap<>();
        //该参数为调用订单组接口来源标志，请勿删除、修改
        requestHeaderMap.put("X-OrderApi-ClientId", "014e7fe2-da7c-437d-aa7d-dd9ebbd2e4f8");
        requestHeaderMap.put("Content-Type", "application/json;charset=UTF-8");
        // 发起请求
        ResponseInfo response = CommonProxyClient.doPostJsonWithOptions(productName, serviceName, methodName, "", jsonData, requestHeaderMap, optionMap);
        if (StringUtils.equalsIgnoreCase(response.getRetcode(), "0")) {
            return response.getResponseBody();
        }
        throw new SoaException(String.format("SOA(%s) error. %s, %s", methodName, response.getRetcode(), response.getRetdesc()));
    }


    /**
     * post调用方法并记录日志
     * 使用注入方式
     * @param productName
     * @param serviceName
     * @param methodName
     * @param params
     * @param timeout
     * @param contentType
     * @param logTag
     * @param type
     * @return
     * @throws Exception
     */
    @SoaLogAnnotations
    public String postFormWithLog(String productName, String serviceName, String methodName, Map<String, String> params, int timeout, String contentType, String logTag, CommunicationEventTypeEnum type) throws Exception {
        return postForm(productName, serviceName, methodName, params, timeout, contentType);
    }

    public static String postForm(String productName, String serviceName, String methodName, Map<String, String> params, int timeout, String contentType) throws SoaException {
        // 参数
        Map<String, Object> optionMap = new HashMap<String, Object>();
        optionMap.put("timeout", timeout);
        // header
        Map<String, String> requestHeaderMap = new HashMap<String, String>();
        if (!StringUtils.isBlank(contentType)) {
            requestHeaderMap.put("Content-Type", contentType);
        }
        // 发起请求
        ResponseInfo response = CommonProxyClient.doPostFormWithOptions(productName, serviceName, methodName, params, requestHeaderMap, optionMap);
        if (StringUtils.equalsIgnoreCase(response.getRetcode(), "0")) {
            return response.getResponseBody();
        }
        throw new SoaException(String.format("SOA(%s) error. %s, %s", methodName, response.getRetcode(), response.getRetdesc()));
    }

    /**
     * 标准格式调用soa
     *
     * @param type
     * @param productName
     * @param serviceName
     * @param methodName
     * @param requestDataMap
     * @param optionMap
     * @param timeout
     * @return
     */
    public static String send(String type, String productName, String serviceName, String methodName, Map<String, String> requestDataMap,
                              Map<String, Object> optionMap, Integer timeout) {

        if (optionMap == null) {
            optionMap = new HashMap<>();
            optionMap.put("timeout", timeout);
        }

        String result = "";
        if (SOAMethodConst.GET.equals(type)) {
            result = StandardApiClient.doGetFormWithOptions(productName, serviceName, methodName, requestDataMap, optionMap);
        } else if (SOAMethodConst.POST.equals(type)) {
            result = StandardApiClient.doPostFormWithOptions(productName, serviceName, methodName, requestDataMap, optionMap);
        }
        return result;
    }

    /**
     * get调用方法并记录日志
     * 使用注入方式
     * @param productName
     * @param serviceName
     * @param methodName
     * @param params
     * @param timeout
     * @param contentType
     * @param logTag
     * @param type
     * @return
     * @throws Exception
     */
    @SoaLogAnnotations
    public String getWithLog(String productName, String serviceName, String methodName, Map<String, String> params, int timeout, String contentType, String logTag, CommunicationEventTypeEnum type) throws SoaException {
        return get(productName, serviceName, methodName, params, timeout, contentType);
    }


    /**
     * get 方法调用SOA，非标准格式
     *
     * @param productName
     * @param serviceName
     * @param methodName
     * @param params
     * @param timeout
     * @param contentType
     * @return
     * @throws Exception
     */
    public static String get(String productName, String serviceName, String methodName, Map<String, String> params, int timeout, String contentType) throws SoaException {
        // 参数
        Map<String, Object> optionMap = new HashMap<String, Object>();
        optionMap.put("timeout", timeout);
        // header
        Map<String, String> requestHeaderMap = new HashMap<String, String>();
        if (!StringUtils.isBlank(contentType)) {
            requestHeaderMap.put("Content-Type", contentType);
        }
        // 发起请求
        ResponseInfo response = CommonProxyClient.doGetFormWithOptions(productName, serviceName, methodName, params, requestHeaderMap, optionMap);
        if (StringUtils.equalsIgnoreCase(response.getRetcode(), "0")) {
            return response.getResponseBody();
        }
        throw new SoaException(String.format("SOA(%s) error. %s, %s", methodName, response.getRetcode(), response.getRetdesc()));
    }

    /**
     * get 方法调用SOA，非标准格式
     *
     * @param productName
     * @param serviceName
     * @param methodName
     * @param requestDataMap
     * @param timeout
     * @return
     * @throws Exception
     */
    public static String get(String productName, String serviceName, String methodName, Map<String, String> requestDataMap, int timeout) throws Exception {
        return get(productName, serviceName, methodName, requestDataMap, timeout, null);
    }


}
