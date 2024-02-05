package com.csc113.lab03;

public class File {
	private String name;
	private int size;
	
	public File(String n, int s) {
		this.name = n;
		this.size = s;
	}
	
	public File(File f) {
		this(f.name, f.size);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
