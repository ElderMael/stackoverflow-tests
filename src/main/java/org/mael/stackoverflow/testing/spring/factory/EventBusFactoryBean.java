package org.mael.stackoverflow.testing.spring.factory;

import java.util.List;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.eventbus.EventBus;

public class EventBusFactoryBean implements FactoryBean<EventBus> {

	@Autowired
	private List<ILanguageChangeListener> languageChangeListeners;

	private EventBus instance;

	@PostConstruct
	public void init() {

		this.instance = new EventBus();

		for (ILanguageChangeListener listener : this.languageChangeListeners) {
			this.instance.register(listener);
		}
	}

	public EventBusFactoryBean() {

	}

	public EventBus getObject() throws Exception {
		return this.instance;
	}

	public Class<?> getObjectType() {
		return EventBus.class;
	}

	public boolean isSingleton() {
		return true;
	}

	public List<ILanguageChangeListener> getLanguageChangeListeners() {
		return languageChangeListeners;
	}

	public void setLanguageChangeListeners(
			List<ILanguageChangeListener> languageChangeListeners) {
		this.languageChangeListeners = languageChangeListeners;
	}

}
