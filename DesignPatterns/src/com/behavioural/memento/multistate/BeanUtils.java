/**    
 * @{#} BeanUtils.java Create on 2013-2-26 ����11:19:17    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.memento.multistate;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @{#} BeanUtils.java Create on 2013-3-4 下午2:56:24    
 *    
 * 类功能说明:   工具类 备份和恢复
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 *
 */
public class BeanUtils {
	public static Map<String, Object> backupProp(Object bean){//���ݶ���  
        Map<String, Object> result = new HashMap<String, Object>();  
        try{  
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());  
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();  
            for(PropertyDescriptor des: descriptors){  
                String fieldName = des.getName();  
                Method getter = des.getReadMethod();  
                Object fieldValue = getter.invoke(bean, new Object[]{});  
                if(!fieldName.equalsIgnoreCase("class")){  
                    result.put(fieldName, fieldValue);  
                }  
            }  
              
        }catch(Exception e){  
            e.printStackTrace();  
        }  
        return result;  
    }  
      
    public static void restoreProp(Object bean, Map<String, Object> propMap){ //�ָ� 
        try {  
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());  
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();  
            for(PropertyDescriptor des: descriptors){  
                String fieldName = des.getName();  
                if(propMap.containsKey(fieldName)){  
                    Method setter = des.getWriteMethod();  
                    setter.invoke(bean, new Object[]{propMap.get(fieldName)});  
                }  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
