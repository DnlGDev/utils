package com.dnlgdev.utils;

import java.math.BigDecimal;

/*
 * @author dglod
 */
public class NumberUtil
{

	public static Integer getValueOrZero(Integer value)
	{
		return value == null ? 0 : value;
	}

	public static Long getValueOrZero(Long value)
	{
		return value == null ? Long.valueOf(0L) : value;
	}

	public static BigDecimal getValueOrZero(BigDecimal value)
	{
		return value == null ? BigDecimal.valueOf(0L) : value;
	}

}
