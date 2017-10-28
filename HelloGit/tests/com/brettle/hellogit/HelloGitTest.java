package com.brettle.hellogit;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloGitTest {

	@Test
	public void test() {
		HelloGit hg = new HelloGit();
		assertEquals("Hello Git! This is Sammy!", hg.getMessage());
	}

}
