package com.wangxinlong.common.utils;

import java.util.Date;
/**
 * 	日期类的工具类
 * @author lenovo
 *
 */
public class DateUtils {
	
	/**
	 * 	返回该日期的1日 00:00:00
	 * 
	 * 	传入日期: 2020-03-11 14:35:20   
	 * 	返回日期: 2020-03-01 00:00:00
	 * @param srcDate
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static Date getDateByInitMonth(Date srcDate) {
		Date descDate = new Date();
		
		descDate = srcDate;
		descDate.setDate(1);
		descDate.setHours(0);
		descDate.setMinutes(0);
		descDate.setSeconds(0);
		return descDate;
	}
	
	/**
	 * 
	 * 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	 * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	 * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	 * 
	 * 闰年: 能被4整除   并且不能被100整除       29
	 * 平年: 不能被4整除     28天 
	 * @param srcDate
	 * @return
	 */
	public static Date getDateByFullMonth(Date srcDate){
		
		Date descDate = getDateByInitMonth(srcDate);
		descDate.setMonth(descDate.getMonth()+1);
		descDate.setSeconds(descDate.getSeconds()-1);
		
		return descDate;
		
	}

}
