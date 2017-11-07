package com.elong.hotel.common.helper;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 获取spring mvc容器中的bean
 * 
 * @author zouyufei
 *
 */
@Component
public class SpringConfigTool implements ApplicationContextAware {

	private static ApplicationContext context = null;

	// spring mvc初始化，自动调用该方法
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	// 根据名字获取实体
	public synchronized static Object getBean(String beanName) {
		if (context == null) {
			return null;
		}
		return context.getBean(beanName);
	}

	// 根据类型获取实体
	public synchronized static <T> T getBean(Class<T> type) {
		if (context == null) {
			return null;
		}
		return context.getBean(type);
	}

}
