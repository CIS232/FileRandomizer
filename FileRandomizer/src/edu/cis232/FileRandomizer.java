package edu.cis232;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileRandomizer {

	public static void main(String[] args) throws IOException {
		//Load lines from file into arraylist
		ArrayList<String> lines = readLinesFromFile("students.txt");
		
		Random rand = new Random();
		//Get random elements from the array list and write them to the output
		//until the arraylist is empty
		while(!lines.isEmpty()){
			int randIndex = rand.nextInt(lines.size());
			String line = lines.remove(randIndex);
			System.out.println(line);
		}
		
	}

	private static ArrayList<String> readLinesFromFile(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner input = new Scanner(file);
		ArrayList<String> lines = new ArrayList<>();
		while(input.hasNext()){
			String line = input.nextLine(); 
			lines.add(line);
		}
		
		input.close();
		return lines;
	}
	

}
