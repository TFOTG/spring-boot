package com.elong.hotel.common.response;

public class ResponseCode {
	/**
	 * 业务处理正常。
	 */
	public static final Integer SUCCESS = 0;

	/**
	 * 参数异常
	 */
	public static final Integer PARAM_ERROR = 400;

	/**
	 * 业务逻辑异常
	 */
	public static final Integer BUSINESS_ERROR = 300;

	/**
	 * 表示数据异常，如数据完整性异常。
	 */
	public static final Integer DATA_ERROR = -500;


    /**
     * 系统异常
     */
    public static final Integer SYSTEM_ERROR = -1;


	/**
	 * 业务通用异常编码。
	 */
	public static final Integer UNKNOWN = -100;
	
	/**
	 * 请求超时
	 */
	public static final Integer TIME_OUT = -200;
}
