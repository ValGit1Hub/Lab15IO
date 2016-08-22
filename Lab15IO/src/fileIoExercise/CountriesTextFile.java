package fileIoExercise;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountriesTextFile {
	
	

	public static void readFile(File myCountriesFile) {

		try {
			FileReader reader = new FileReader(myCountriesFile);
			BufferedReader bReader = new BufferedReader(reader);
			String newLine = bReader.readLine();
			while (newLine != null) {
				System.out.println(newLine);
				newLine = bReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		}
	}

	
	/**
	 * @param myConfigFile
	 */
	public static void writeToFile(File myCountriesFile) {
		PrintWriter wrt = null;
		try {
			wrt = new PrintWriter(myCountriesFile);
			wrt.println("Germany");
			wrt.println("The United States");
			wrt.println("China");
			wrt.println("Itay");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			wrt.close();
		}
	}

	public static void writeToFileAppend(File myCountriesFile) {
		 FileWriter wrt = null;

	     try {
	          System.out.print("Enter country name: ");   
	          Scanner scan1 = new Scanner(System.in);
	          String userCountry = scan1.nextLine();
	          System.out.println("This country has been saved to the list.");
	          wrt = new FileWriter(myCountriesFile, true); 
	          wrt.append(userCountry + "\n");
	          wrt.close();
	         //scan1.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	        }
	    

	}

}
