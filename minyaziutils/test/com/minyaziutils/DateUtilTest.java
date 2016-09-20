package com.minyaziutils;

import org.junit.Test;

/**
 * 日期工具类Test<br>
 * 
 * @author minyazi
 */
public class DateUtilTest {
	
	@Test
	public void testGetDate() {
		LogUtil.info(DateUtil.getDate());
	}
	
	@Test
	public void testGetISODate() {
		LogUtil.info(DateUtil.getISODate());
	}
	
	@Test
	public void testGetSpecifiedDay() {
		LogUtil.info(DateUtil.getSpecifiedDay("2016-01-01", 1));
	}
	
	@Test
	public void testGetAge() {
		LogUtil.info(DateUtil.getAge("1990-01-01"));
	}
	
}
