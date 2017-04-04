package com.khoslalabs.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

public class Main {
	public static void main(String[] args) {

		try {
			readAllExample();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private static void readAllExample() throws IOException {
		System.out.println("\n**** readAllExample ****");
		String[] row = null;
		String csvFilename = "C:\\work\\sample.csv";
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
		List content = csvReader.readAll();
		String className="";

		for (Object object : content) {
			row = (String[]) object;
			String name= row[0];
			String age=row[1];
			String salary = row[2];
			//String[] strArray = new String[row.length];
			/*strArray = row[0].split(":");
			String[] strDataArray = new String[3];
			strDataArray = row[0].split(",");
			if(strArray[0].equals("Type")){
				className = strArray[1];
			}*/
			/*else if (className.equals("Employee") && !strDataArray[0].equals("name")){
				Employee employee = new Employee();
				employee.setName(strDataArray[0]);
				employee.setAge(Integer.valueOf(strDataArray[1]));
				System.out.println(employee.toString());
			}
			else if(className.equals("Department")  && !strDataArray[0].equals("code")){
				Department department = new Department();
				department.setCode(strDataArray[0]);
				department.setName(strDataArray[1]);
				System.out.println(department.toString());
			}*/

		}
		csvReader.close();
	}

}
