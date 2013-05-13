package com.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @{#} Folder.java Create on 2013-4-2 下午4:36:43    
 *    
 * class desc:   目录。目录下面有子目录，文件。相当于Composite
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 *
 */
public class Folder implements IRoot{

	private String name;
	private List<IRoot> folderList;
	public Folder(String name){
		this.name = name;
		this.folderList = new ArrayList<IRoot>();
	}
	
	@Override
	public boolean addFile(IRoot file) {
		return folderList.add(file);
	}

	@Override
	public boolean removeFile(IRoot file) {
		return folderList.remove(file);
	}

	@Override
	public List<IRoot> getFile() {
		return folderList;
	}

	@Override
	public void display() {
		System.out.println(name);
		for(IRoot f : folderList){
			if(f instanceof Folder){
				 System.out.print("|__");
			}
			f.display();
		}
	}

	

}
