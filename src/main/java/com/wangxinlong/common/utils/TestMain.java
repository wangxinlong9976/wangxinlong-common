package com.wangxinlong.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
	
	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) throws Exception {
		Date srcDate = new Date();
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(srcDate));
		
		
		/*Date descDate = DateUtils.getDateByInitMonth(srcDate);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(descDate));*/
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(DateUtils.getDateByFullMonth(srcDate)));
		
		
		
		System.out.println("-------------------------------------------");
		
		System.out.println(FileUtils.getExtendName("aaaa.jsp"));
		System.out.println("-------------------------------------------");
		
	/*	FileInputStream fis = new FileInputStream("aaa.txt");
		int read = fis.read();
		System.out.println(read);
		StreamUtils.closeAll(fis);
		int read1 = fis.read();
		System.out.println(read1);*/
		
		/*FileInputStream fis = new FileInputStream(new File("aaa.txt"));
		String desc = StreamUtils.readTextFile(fis);
		System.out.println(desc);*/
	}
}
