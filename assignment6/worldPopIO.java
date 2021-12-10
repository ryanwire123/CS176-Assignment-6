package assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class worldPopIO {

	public static void main(String[] args) throws FileNotFoundException {
		File areaInput = new File("C:\\Users\\wirer\\Documents\\CS175L Java Workspace\\IO Assignment 6\\src\\assignment6\\worldAreaInput.txt");
		File popInput = new File("C:\\Users\\wirer\\Documents\\CS175L Java Workspace\\IO Assignment 6\\src\\assignment6\\worldPopInput.txt");
		Scanner inArea = new Scanner(areaInput);
		Scanner inPop = new Scanner(popInput);
		inArea.useDelimiter("");
		inPop.useDelimiter("");
		PrintWriter densityOutput = new PrintWriter("C:\\Users\\wirer\\Documents\\CS175L Java Workspace\\IO Assignment 6\\src\\assignment6\\populationDensityOutput.txt");
		densityOutput.println("Country name:                     Population Density:");
		densityOutput.println("=============                     ===================");
		while(inArea.hasNextLine() && inPop.hasNextLine())  
		{
			String valueArea=inArea.nextLine();
			String valuePop=inPop.nextLine(); 
			Scanner lineScannerA=new Scanner(valueArea);
			Scanner lineScannerP=new Scanner(valuePop);
			String country=""; 
			while(!lineScannerA.hasNextDouble()) 
			{
				country=country+" "+lineScannerA.next(); 
			}	
			double area = lineScannerA.nextDouble();
			double pop;
			while(!lineScannerP.hasNextDouble()) 
			{
				lineScannerP.next(); 
			}	
			pop = lineScannerP.nextDouble();
			double density = pop/area;
			densityOutput.printf("%-30s %20.2f\n", country, density);	
		}

		System.out.println("Output is done!");
		
		inArea.close();
		inPop.close();
		densityOutput.close();
	}
			
}

		
	


		

		

	


