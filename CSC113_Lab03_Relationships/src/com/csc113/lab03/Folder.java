package com.csc113.lab03;

public class Folder {
	private String name;
	private File files[];
	private int fileCount;
	
	
	public Folder(String name, int size) {
		this.name = name;
		this.files = new File[size];
		this.fileCount = 0; // no need but for logic.
	}
	
	public boolean addFile(File f) {
		if(fileCount >= files.length) {
			System.out.println("Folder is Full");
			return false;
		}
		
		for(int i = 0; i < fileCount; i++) {
			if(f.getName().equalsIgnoreCase(files[i].getName())) {
				System.out.println("File is already added !");
				return false;
			}
		}
		
		files[fileCount] = new File(f);
		fileCount++;
		return true;
	}
	
	public File getLargestFile() {
		if(fileCount <= 0) return null;
		
		File LargestFile = files[0];
		
		for(int i = 1; i < fileCount; i++) {
			if(LargestFile.getSize() < files[i].getSize()) {
				LargestFile = files[i];
			}
		}
		return LargestFile;
	}
	
	public String toString() {
		String foldername = "* Folder " + this.name + "(" + fileCount + "):" + "\n";
		for(int i = 0; i < fileCount; i++) {
			foldername += "  - File: " + files[i].getName() + ", size: " + files[i].getSize() + "\n";
		}
		return foldername;
	}
}
