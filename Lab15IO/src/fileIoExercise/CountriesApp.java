package fileIoExercise;
//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
import java.nio.file.*;
import java.util.Scanner;


public class CountriesApp {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int userSelection = 0;
		Path filePath = Paths.get("countries.txt");
		File myCountriesFile = filePath.toFile();
		System.out.println("Welcome to the Countries Maintenance Application!");
		System.out.println();
		while (userSelection != 3) {
			System.out.println("Select '1' to see a list of the countries.");
			System.out.println("Select '2' to add a country to the list.");
			System.out.println("Select '3' to exit the program.");
			System.out.println();
			System.out.print("Please enter your selection: ");
			userSelection = scan1.nextInt();
			scan1.nextLine();

			 //CountriesTextFile ctf = new CountriesTextFile();
			switch (userSelection) {
			case 1:
				// 1 = display list of countries
				CountriesTextFile.writeToFile(myCountriesFile);
				CountriesTextFile.readFile(myCountriesFile);
				break;
			case 2:
				// 2 = allows user to add to the list
				CountriesTextFile.writeToFileAppend(myCountriesFile);
				break;
			case 3:
				// 3 = display goodbye message and end
				System.out.println("Goodbye");
				break;
			default:
				break;
			}// end of switch
		} // end of while
        scan1.close();
	}//end of main
	  
}//end of class
