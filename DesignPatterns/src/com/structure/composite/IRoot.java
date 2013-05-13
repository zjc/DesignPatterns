package com.structure.composite;

import java.util.List;
/**
 * 
 * @{#} IRoot.java Create on 2013-4-2 下午4:30:09    
 *    
 * class desc:   File与Folder的共通接口界面。相当于Component。
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 */
public interface IRoot {
	public boolean addFile(IRoot file);
	public boolean removeFile(IRoot file);
	public List<IRoot> getFile();
	public void display();
}
