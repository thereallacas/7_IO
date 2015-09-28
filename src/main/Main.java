package main;
import java.util.Scanner;

import commandchooser.CommandChooser;

public class Main {
	static public void main(String[] args){
		String input;
		Scanner in = new Scanner(System.in);
		CommandChooser parancskivalaszto= new CommandChooser();
		while (in.hasNext()){
			//in.useDelimiter(System.getProperty("line.separator"));
			input = in.nextLine();

			String[] parancs=input.split(" ");

			parancskivalaszto.utvalaszto(parancs);
		}
		in.close();
	}

}
