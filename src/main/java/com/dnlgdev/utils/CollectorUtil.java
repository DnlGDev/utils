package com.dnlgdev.utils;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * @author dglod
 */
public class CollectorUtil
{

	public static <T> Collector<T, ?, T> toSingle()
	{
		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			if (list.size() != 1)
			{
				throw new IllegalStateException();
			}
			return list.get(0);
		});
	}

	public static <T> Collector<T, ?, Optional<T>> toSingleOptional()
	{
		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			if (list.size() > 1)
				throw new IllegalStateException();
			if (list.size() == 1)
				return Optional.of(list.get(0));
			return Optional.empty();
		});
	}

	public static <T> T getFirstOrNull(Set<T> set)
	{
		if (set == null || set.isEmpty())
			return null;

		return set.iterator().next();
	}
}
