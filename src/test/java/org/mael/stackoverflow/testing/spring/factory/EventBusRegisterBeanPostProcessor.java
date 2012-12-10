package org.mael.stackoverflow.testing.spring.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.google.common.eventbus.EventBus;

public class EventBusRegisterBeanPostProcessor implements BeanPostProcessor,
		ApplicationContextAware {

	@Autowired
	private EventBus eventBus; // The only event bus i assume...

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {

		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {

		if (bean instanceof ILanguageChangeListener) {
			registerToEventBus(bean);
		}

		return bean;
	}

	private void registerToEventBus(Object bean) {

		this.eventBus.register(bean);

	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
	}

}
