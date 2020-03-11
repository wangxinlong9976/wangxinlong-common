package com.wangxinlong.common.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * 	流的工具类
 * @author lenovo
 *
 */
public class StreamUtils {
	
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(Closeable...closeables){
		
		if(closeables!=null) {
			for (Closeable closeable : closeables) {
				if(closeable!=null) {
					try {
						closeable.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
		int i = 0;
		byte[] b = null;
		if(src!=null) {
			b=new byte[1024];
			while((i=src.read(b))!=-1) {
				
			}
			StreamUtils.closeAll(src);
		}
		return new String(b);
	}

	
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		
		return readTextFile(new FileInputStream(txtFile));	
	}


}
