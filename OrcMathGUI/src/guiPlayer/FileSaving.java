package guiPlayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSaving {

	private String input;
	private String fileName;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		FileSaving instance = new FileSaving();
		System.out.println("What will you name the file?");
		instance.fileName = in.nextLine();
		System.out.println("What text will you save?");
		instance.input = in.nextLine();
		instance.testSaveContent(instance.fileName);
	}
	


	private void testSaveContent(String fileName) {
		try{    
			FileWriter fw=new FileWriter(fileName);
			fw.write(input);
			fw.close();    
			System.out.println("Success! File \""+fileName+"\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}
	
	private static void displayContent(List<String> content) {
		//print the content:
		for(String item : content){
			System.out.println(item);
		}
	}
	
}