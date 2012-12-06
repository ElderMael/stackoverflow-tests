package org.mael.stackoverflow.testing;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySources;

public class PropertySourcesAdderBean implements InitializingBean,
		ApplicationContextAware {

	private Properties properties;

	private ApplicationContext applicationContext;

	public PropertySourcesAdderBean() {

	}

	public void afterPropertiesSet() throws Exception {

		PropertiesPropertySource propertySource = new PropertiesPropertySource(
				"helloWorldProps", this.properties);

		ConfigurableEnvironment environment = (ConfigurableEnvironment) this.applicationContext
				.getEnvironment();

		environment.getPropertySources().addFirst(propertySource);

	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {

		this.applicationContext = applicationContext;

	}

}
