package com.elong.hotel.hotelconfirm.confirmorder.util;

import com.elong.hotel.hotelconfirm.confirmorder.enums.TransactionStatusEnum;

public class OrderPayStatusUtil {

	/**
	 * 获取显示支付状态名称
	 * @param transactionProcessType
	 * @param transactionStatus
	 * @return
	 */
	public static String getShowPayStatus(int transactionProcessType, int transactionStatus) {
		StringBuilder sb = new StringBuilder();
		if (transactionProcessType == 0) {
			switch (transactionStatus) {
			case 0:
			case 1:
				sb.append("等待支付");
				break;
			case 2:
				sb.append("正在支付");
				break;
			case 3:
				sb.append("支付成功");
				break;
			case 4:
				sb.append("支付失败");
				break;
			}
		} else if (transactionProcessType == 1) {
			switch (transactionStatus) {
			case 2:
				sb.append("正在退款");
				break;
			case 3:
				sb.append("退款成功");
				break;
			case 4:
				sb.append("退款失败");
				break;
			case 5:
				sb.append("未支付，无需退款");
				break;
			}

		} else if (transactionProcessType == 2) {
			switch (transactionStatus) {
			case 0:
			case 1:
				sb.append("等待担保");
				break;
			case 2:
				sb.append("正在担保");
				break;
			case 3:
				sb.append("担保成功");
				break;
			case 4:
				sb.append("担保失败");
				break;
			}

		} else if (transactionProcessType == 3) {
			switch (transactionStatus) {
			case 3:
				sb.append("解除担保成功");
				break;
			case 4:
				sb.append("解除担保失败");
				break;
			case 2:
				sb.append("正在解除担保");
				break;
			case 5:
				sb.append("未担保，无需解除");
				break;
			}

		} else if (transactionProcessType == 4) {
			switch (transactionStatus) {
			case 3:
				sb.append("扣款成功");
				break;
			case 4:
				sb.append("扣款失败");
				break;
			case 2:
				sb.append("正在扣款");
				break;
			case 5:
				sb.append("未担保，无法扣款");
				break;
			}

		} else if (transactionProcessType == 5) {
			sb.append("信用住担保").append(TransactionStatusEnum.getValue(transactionStatus));
		} else if (transactionProcessType == 6) {
			sb.append("信用住解除担保").append(TransactionStatusEnum.getValue(transactionStatus));
		} else if (transactionProcessType == 7) {
			sb.append("信用住扣款").append(TransactionStatusEnum.getValue(transactionStatus));
		} else if (transactionProcessType == 8) {
			sb.append("信用住退款").append(TransactionStatusEnum.getValue(transactionStatus));
		} else if (transactionProcessType == 9) {
			sb.append("闪住扣款").append(TransactionStatusEnum.getValue(transactionStatus));
		} else if (transactionProcessType == 10) {
			sb.append("闪住退款").append(TransactionStatusEnum.getValue(transactionStatus));
		}
		return sb.toString();
	}
}
