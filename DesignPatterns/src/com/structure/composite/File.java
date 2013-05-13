package com.structure.composite;

import java.util.List;

/**
 * 
 * @{#} File.java Create on 2013-4-2 下午4:35:32    
 *    
 * class desc:   文件。存在于目录之中。相当于Leaf
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 */
public class File implements IRoot{

	private String name;
	public File(String name){
		this.name = name;
	}
	@Override
	public boolean addFile(IRoot file) {
		return false;
	}

	@Override
	public boolean removeFile(IRoot file) {
		return false;
	}

	@Override
	public List<IRoot> getFile() {
		return null;
	}
	@Override
	public void display() {
		 System.out.println("     |___"+name);
	}

	

}
