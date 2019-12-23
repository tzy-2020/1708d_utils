package com.tzy.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class StreamTest {
  
	@Test
	public void test() {
		try {
			FileInputStream fis = new  FileInputStream("d:/goods.txt");
			//List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("/goods.txt"));
	        List<String> list = StreamUtil.read(fis);
			for (String string : list) {
				System.out.println(string);
			}
		  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
