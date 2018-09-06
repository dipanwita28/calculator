package com.teamsankya.calculator;

import org.apache.log4j.Logger;

public class Addition {
	private static final Logger LOGGER =Logger.getLogger(Addition.class);
	
	public static int add(int a,int b)
	{
		LOGGER.info("addition of two integers"+a +"+" +b);
		return a+b;
	}

	public static long add(long a,long b)
	{
		return a+b;
	}
}
