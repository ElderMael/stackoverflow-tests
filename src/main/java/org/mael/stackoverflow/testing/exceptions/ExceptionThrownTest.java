package org.mael.stackoverflow.testing.exceptions;

import java.io.FileNotFoundException;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionThrownTest {

	@Test
	public void testingExceptions() {

		try {
			ExceptionThrownTest.main(new String[] {});
		} catch (Throwable e) {
			assertTrue(e instanceof RuntimeException);
		}

	}

	public static void main(String[] args) throws FileNotFoundException {

		anotherMethod();

		// Won't be executed because RuntimeException thrown
		unreachableMethod();

	}

	private static void anotherMethod() {
		throw new RuntimeException();
	}

	private static void unreachableMethod() {
		System.out.println("Won't execute");
	}
}
