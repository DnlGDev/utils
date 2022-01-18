package com.dnlgdev.utils;

import java.util.Objects;
import java.util.stream.Stream;

/*
 * @author dglod
 */
public class BooleanUtil
{
	public static boolean isTrue(Boolean value) {
		return value != null && value;
	}

	public static boolean isFalse(Boolean value) {
		return value != null && !value;
	}

	public static boolean isTrueOrNull(Boolean value) {
		return value == null || value;
	}

	public static boolean isFalseOrNull(Boolean value) {
		return value == null || !value;
	}

	public static boolean isAtLeastOneTrue(Boolean... values)
	{
		return Stream.of(values) //
				.filter(Objects::nonNull) //
				.anyMatch(v -> v);
	}
}
