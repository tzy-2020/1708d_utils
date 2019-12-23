package com.tzy.utils;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void testHashText() {
		
		String src="abc";
		boolean b = StringUtil.hasText(src);
		if (b) {
		  System.out.println("是字符串");	
		} else {
	       System.out.println("不是字符串");
		}
		
	}
	@Test
	public void testIsNumber() {
		
		String src="wwwe";
		boolean b = StringUtil.isNumber(src);
		if (b) {
		  System.out.println("是数字");	
		} else {
	       System.out.println("不是数字");
		}
		
	}
}
