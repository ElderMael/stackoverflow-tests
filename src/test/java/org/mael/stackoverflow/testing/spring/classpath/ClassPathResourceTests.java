package org.mael.stackoverflow.testing.spring.classpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.*;

public class ClassPathResourceTests {

	@Test
	public void testClassPathInputStream() throws IOException {

		// Trailing space removed
		ClassPathResource file = new ClassPathResource(
				"/org/mael/stackoverflow/testing/spring/classpath/resource.txt");

		String content = new BufferedReader(new InputStreamReader(
				file.getInputStream())).readLine();

		assertEquals("Hello World!", content);

	}

}
