package com.elong.hotel.demo.po;

import com.alibaba.fastjson.JSON;
import com.elong.hotel.common.groupfilter.context.GroupFilterContext;

/**
 * DemoModel
 * @author nobody
 *
 */
public class DemoModel {

	public static void main(String[] args){
		GroupFilterContext base = new GroupFilterContext();
		String json = JSON.toJSONString(base);
		base = JSON.parseObject(json, GroupFilterContext.class);
	}

	/**
	 * HelloWorld
	 */
	public String helloWorld() {
		return "Hello World";
	}	
}
