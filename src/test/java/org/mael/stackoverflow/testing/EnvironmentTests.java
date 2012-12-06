package org.mael.stackoverflow.testing;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import static org.junit.Assert.*;

public class EnvironmentTests {

	@Test
	public void addPropertiesToEnvironmentTest() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"testContext.xml");

		Environment environment = context.getEnvironment();

		String world = environment.getProperty("hello");

		assertNotNull(world);

		assertEquals("world", world);

		System.out.println("Hello " + world);

	}

}
