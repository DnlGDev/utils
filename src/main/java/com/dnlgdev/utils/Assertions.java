package com.dnlgdev.utils;

import java.util.Objects;
import java.util.function.Supplier;

/*
 * @author dglod
 */
public class Assertions
{

	public static <T extends RuntimeException> void assertNotNull(Object object, ExceptionProvider<T> e) throws T
	{
		assertThat(() -> object != null, e);
	}

	public static <T extends RuntimeException> void assertNotEmpty(String object, ExceptionProvider<T> e) throws T
	{
		assertNotNull(object, e);
		assertThat(() -> !object.isEmpty(), e);
	}

	public static <T extends RuntimeException> void assertNotEmpty(Object[] object, ExceptionProvider<T> e) throws T
	{
		assertThat(() -> object.length > 0, e);
	}

	public static <T extends RuntimeException> void assertThat(AssertProvider assertProvider, ExceptionProvider<T> e) throws T
	{
		if (!assertProvider.assertValue())
			throw e.getException();
	}

	public static <T extends RuntimeException> void assertEquals(Object o1, Object o2, ExceptionProvider<T> e) throws T
	{
		assertThat(() -> Objects.equals(o1, o2), e);
	}

	@FunctionalInterface
	public interface AssertProvider
	{

		boolean assertValue();
	}

	@FunctionalInterface
	public interface ExceptionProvider<T extends RuntimeException>
	{

		T getException();
	}

	public static class ExceptionThrower
	{

		private final boolean assertResult;

		public ExceptionThrower(boolean assertResult)
		{
			this.assertResult = assertResult;
		}

		public void orElseThrowException(Supplier<RuntimeException> e) throws RuntimeException
		{
			if (!assertResult)
			{
				throw e.get();
			}
		}
	}
}
