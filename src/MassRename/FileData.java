package MassRename;

import java.io.File;

public class FileData {
	
	public FileData(String n, String d){
		this(n,n,d,d);
	}
	
	public FileData(String nn, String on, String nd, String od){
		setAll(nn,on,nd,od);
	}
	
	public void setAll(String newName, String oldName, String newDir, String oldDir){
		this.newName = newName;
		this.oldName = oldName;
		this.newDir = newDir;
		this.oldDir = oldDir;
	}
	
	public void setNew(String newName, String newDir){
		this.newName = newName;
		this.newDir = newDir;
	}
	
	public void setOld(String oldName, String oldDir){
		this.oldName = oldName;
		this.oldDir = oldDir;
	}
	
	public void setNewName(String newName){
		this.newName = newName;
	}
	
	public void setOldName(String oldName){
		this.oldName = oldName;
	}
	
	public void setNewDir(String newDir){
		this.newDir = newDir;
	}
	
	public void setOldDir(String oldDir){
		this.oldDir = oldDir;
	}
	
	public String getNewPath(){
		return newDir +File.separator +newName;
	}
	
	public String getOldPath(){
		return oldDir +File.separator +oldName;
	}

	public String newName;
	public String oldName;
	public String newDir;
	public String oldDir;
	
}
