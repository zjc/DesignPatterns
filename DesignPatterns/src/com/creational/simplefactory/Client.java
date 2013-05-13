/**    
 * @{#} Client.java Create on 2013-5-7 下午2:18:40    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.simplefactory;

/**    
 * @{#} Client.java Create on 2013-5-7 下午2:18:40    
 *    
 * class desc:   
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class Client {

	public static void main(String[] args) {
		IDB mysqlDB = DBFactory.getDB(DBFactory.MYSQL_TYPE);
		if(null != mysqlDB){
			mysqlDB.getDB();
		}
		
		IDB sqlserverDB = DBFactory.getDB(DBFactory.SQLSERVER_TYPE);
		if(null != sqlserverDB){
			sqlserverDB.getDB();
		}
		
		IDB oracleDB = DBFactory.getDB(DBFactory.ORACLE_TYPE);
		if(null != oracleDB){
			oracleDB.getDB();
		}
		
		IDB mongoDB = DBFactory.getDB(DBFactory.MONGO_TYPE);
		if(null != mongoDB){
			mongoDB.getDB();
		}
		
	}

}
