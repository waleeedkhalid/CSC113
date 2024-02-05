package com.csc113.lab03;

public class FolderTest {
	public static void main(String[] args) {
		// • Create a folder of size 10
		Folder Games = new Folder("Games", 10);
		// • Create and add three files to the folder (see sample run)
		File GAME1 = new File("G1", 1);
		File GAME2 = new File("G1", 8);
		File GAME3 = new File("G1", 1);
		
		Games.addFile(GAME1);
		Games.addFile(GAME2);
		Games.addFile(GAME3);
		
		// • Print the folder
		System.out.println(Games.toString());
		// • Modify the name of the largest file in the folder
		Games.getLargestFile().setName("LargestFile");
		// • Printthefolder
		System.out.println(Games.toString());
	}
}
