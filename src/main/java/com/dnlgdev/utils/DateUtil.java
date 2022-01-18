package com.dnlgdev.utils;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * @author dglod
 */
public class DateUtil
{

	public static String formatLocalDateTime(LocalDateTime date)
	{
		if (date == null)
		{
			return "";
		}

		return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
	}

	public static String formatLocalDateTimeToDateString(LocalDateTime date)
	{
		if (date == null)
		{
			return "";
		}

		return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	}

	public static String formatLocalDate(LocalDate date)
	{
		if (date == null)
		{
			return "";
		}

		return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	}

	public static LocalDate toLocalDate(String v, String pattern)
	{
		if (v == null)
			return null;

		return LocalDate.parse(v, DateTimeFormatter.ofPattern(pattern));
	}

	public static Timestamp convertLocalDateTimeToTimestamp(LocalDateTime localDateTime)
	{
		if (localDateTime == null)
			return null;
		return Timestamp.valueOf(localDateTime);
	}

	public static LocalDateTime convertTimestampToLocalDateTime(Timestamp timestamp)
	{
		if (timestamp == null)
			return null;
		return timestamp.toLocalDateTime();
	}

	public static Date convertLocalDateTimeToDate(LocalDateTime localDateTime)
	{
		Instant instant = localDateTime.toInstant(ZoneOffset.UTC);
		return Date.from(instant);
	}

	public static java.sql.Date convertLocalDateToSqlDate(LocalDate localDate)
	{
		if(localDate == null)
			return null;
		return java.sql.Date.valueOf(localDate);
	}

	public static LocalDate min(LocalDate d1, LocalDate d2) {
	    return d1.compareTo(d2) <= 0 ? d1 : d2;
    }

}
