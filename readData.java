package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import objects.Restaurant;

import org.apache.commons.csv.CSVParser;

public class readData {
	
	private static String fileName = "MKEfoodgrading.csv";
	
	
	

	public static ArrayList<Restaurant> getRestaurantData() throws Exception {
		
		ArrayList<Restaurant> restaurantArrayList = new ArrayList<Restaurant>();		
		String cwd = System.getProperty("user.dir");	//gillen
		try 
		{
			cwd = cwd.substring(0,cwd.lastIndexOf("/"));
		}
		catch(Exception e) {}	//	If there is no forward slash do nothing	//
		String file=cwd+"/src/"+fileName; //end gillen 

		
	try(
			Reader reader = Files.newBufferedReader(Paths.get(file));
			CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
	){
		

	for (CSVRecord csvRecord : csvParser) {
		// Accessing Values by Column Index
		String name = csvRecord.get(0);
		String address = csvRecord.get(1);
		int alderDist = Integer.parseInt(csvRecord.get(2));
		String inspectDate = csvRecord.get(3);
		String grade = csvRecord.get(4);
		int restaurantNumber = (int) csvRecord.getRecordNumber();
		Restaurant r = new Restaurant(name,address,grade,inspectDate, alderDist,restaurantNumber);
		restaurantArrayList.add(r);
		
		
	}
	}
	return restaurantArrayList;
}
}



