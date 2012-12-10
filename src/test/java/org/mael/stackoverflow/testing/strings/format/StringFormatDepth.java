package org.mael.stackoverflow.testing.strings.format;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringFormatDepth {

	@Test
	public void stringFormatDepth() {

		int depth = 0;

		String.format("%" + depth + "s", " ");

	}

	private String getOriginalText() {
		return "original";
	}
}
