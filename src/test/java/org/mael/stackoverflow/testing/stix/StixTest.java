package org.mael.stackoverflow.testing.stix;

import org.junit.Test;

import static org.junit.Assert.*;

public class StixTest {

	@Test
	public void stixTest() {

		StixBoard game1 = new StixBoard(6);

		assertEquals(6, game1.getNumStix());

		System.out.println(game1.getNumStix());

	}
}
