package com.elong.hotel.common.response;


/**
 * 
 * @author zouyufei
 *
 */
public interface ResponseCodeConst {
	/**
	 * 成功
	 */
	int SUCCESS = 0;
	/**
	 * 错误
	 */
	int ERROR = -1;
	/**
	 * 校验失败
	 */
	int CHECK_ERROR = 400;
	/**
	 * 重单校验失败
	 */
	int ORDER_REPEAT = 2;
	/**
	 * 部分错误
	 */
	int PART_ERROR = 1;
	/**
	 * 入住反馈校验失败
	 */
	int FEEDBACK_VALIDATE_ERROR = 1;
	/**
	 * 一审进出库校验失败
	 */
	int FIRSTVERIFY_VALIDATE_ERROR = 1;

	int ORDER_MESSAGENAME_VALIDATE_ERROR = 2;

	int STORAGE_VALIDATE_ERROR = 1;

	/**
	 * feedbackguid 重复
	 */
	int FEEDBACK_FeedbackGuidDuplicate = 2;
	/**
	 * 时间限制
	 */
	int TIME_LIMIT = 330;
}
