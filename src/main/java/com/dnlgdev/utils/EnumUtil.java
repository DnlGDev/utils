package com.dnlgdev.utils;

/*
 * @author dglod
 */
public class EnumUtil
{
	public static <T extends Enum<T>> T getByString(Class<T> clazz, String s)
	{

		try //
		{
			if (s == null)
				return null;

			return T.valueOf(clazz, s);
		}
		catch (IllegalArgumentException e)
		{
			return null;
		}
	}
}
