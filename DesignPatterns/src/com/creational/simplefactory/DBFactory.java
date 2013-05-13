/**    
 * @{#} DBFactory.java Create on 2013-5-7 下午2:09:33    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.creational.simplefactory;

/**
 * @{# DBFactory.java Create on 2013-5-7 下午2:09:33
 * 
 *     class desc:
 * 
 *     <p>
 *     Copyright: Copyright(c) 2013
 *     </p>
 *     <p>
 *     Company: morelap
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>
 * 
 * 
 */
public class DBFactory {
	public static final String MYSQL_TYPE = "mysql";
	public static final String SQLSERVER_TYPE = "sqlserver";
	public static final String ORACLE_TYPE = "oracle";
	public static final String MONGO_TYPE = "mongo";

	public static IDB getDB(String type) {
		if (MYSQL_TYPE.equals(type)) {
			return new MySqlDB();
		} else if (SQLSERVER_TYPE.equals(type)) {
			return new SqlServerDB();
		} else if (ORACLE_TYPE.equals(type)) {
			return new OracleDB();
		} else {
			//这边可以抛出一个自定义的异常类来处理
			System.out.println("没有找到对应的数据库");
			return null;
		}
	}
}
