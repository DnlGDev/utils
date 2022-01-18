package com.dnlgdev.utils;

import java.util.HashMap;

/*
 * @author dglod
 */
public class StopWatch {

	private static final String DEFAULT = "default";
	
	private static final HashMap<Object, Long> starts = new HashMap<>();
	
	public static void start() {
		Long start = System.currentTimeMillis();
		starts.put(DEFAULT, start);
	}
	
	public static void stop(String s) {
		
		Long start = starts.get(DEFAULT);
		if(start == null) {
			System.out.println("not started");
		}
		
		System.out.println(s + " " + (System.currentTimeMillis() - start));	
	}
	
	public static void stop() {
		
		Long start = starts.get(DEFAULT);
		if(start == null) {
			System.out.println("not started");
		}
		
		System.out.println("" + (System.currentTimeMillis() - start));	
	}
	
	public static void startID(String id) {
		Long start = System.currentTimeMillis();
		starts.put(id, start);
	}
	
	public static String stopID(String id, String s) {
		
		Long start = starts.get(id);
		if(start == null) {
			System.out.println("not started");
		}

		String out = s + " " + (System.currentTimeMillis() - start);
		System.out.println(out);
		return out;
	}
	
	public static Long stopIDReturnLong(String id) {
		
		Long start = starts.get(id);
		if(start == null) {
			System.out.println("not started");
			return null;
		}

		
		return ((System.currentTimeMillis() - start));		
	}
	
	public static String stopIDOnlyRetunr(String id) {
		Long start = starts.get(id);


		String out = id + " " + (System.currentTimeMillis() - start);

		return out;
	}
	
	public static void stopID(String id) {
		stopID(id, id);
	}
}
