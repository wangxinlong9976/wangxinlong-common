package com.wangxinlong.common.utils;

import java.io.FileNotFoundException;

import javax.annotation.processing.FilerException;

/**
 * 	文件类的工具类
 * @author lenovo
 *
 */
public class FileUtils {
	/**
	 * 	方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException 
	 * @throws FilerException 
	 */
	public static String getExtendName(String fileName) throws Exception{
		if(fileName==null || fileName.equals("")) {
			System.out.println("文件名不能为空!");
			throw new FileNotFoundException("文件未找到!");
		}
		if(fileName.indexOf(".")==-1) {
			System.out.println("不是一个文件!");
			throw new FilerException("不是一个文件!");
		}
		
		return fileName.substring(fileName.lastIndexOf("."));
	}

}
