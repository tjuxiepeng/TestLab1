package com.junit_test_case;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.junit_test_lab1.TestTriangle;

public class TriangleTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetKind() {
		assertEquals("等边三角形",TestTriangle.getKind(1, 1, 1));
		assertEquals("等腰三角形",TestTriangle.getKind(1, 1, 2));
		assertEquals("不是三角形",TestTriangle.getKind(1, 1, 5));
		assertEquals("普通三角形",TestTriangle.getKind(4, 5, 6));
	}

}
