package com.artos.mentoring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SomeRandomClassTest
{

	private int fasz;

	@Before
	public void setUp() throws Exception
	{
    fasz = 5;
	}

	@Test
	public void getANumber() throws Exception
	{
		assertEquals(5, fasz);
	}

}
