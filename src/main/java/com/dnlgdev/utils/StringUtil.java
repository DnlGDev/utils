package com.dnlgdev.utils;

/*
 * @author dglod
 */
public class StringUtil
{

	public static boolean isNullOrEmpty(String value)
	{
		return value == null || value.isEmpty();
	}

	public static String toLowerCase(String value)
	{
		if (value == null)
			return null;

		return value.toLowerCase();
	}

	public static String defaultIfEmpty(String value, String defaultValue)
	{
		if (isNullOrEmpty(value))
			return defaultValue;

		return value;
	}

}
