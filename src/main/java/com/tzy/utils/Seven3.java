package com.tzy.utils;

import java.io.File;
public class Seven3 {
	
public static void main(String[] args)throws  Exception{
  
	File file=new File("D:\\Batch\\emp.txt");
    getName(file);
    
}


//测试获取拓展名
public static void getName(File file){
	
   String name=file.getName();
   String tz=name.substring(name.lastIndexOf("."));
   System.out.println("文件名为"+name+"拓展名为："+tz);

}

}
