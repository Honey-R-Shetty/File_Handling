package com.csv;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteToCsv {

	public static void main(String[] args) {
		String file = "src/main/resources/Employees.csv";
		writeToCSV(file);
	}

	public static void writeToCSV(String filePath) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Mani", 50000), new Employee(2, "Jaya", 60000),
				new Employee(3, "Honey", 55000));

		try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
			writer.writeNext(new String[] { "ID", "Name", "Salary" });

			for (Employee emp : employees) {
				String[] row = { String.valueOf(emp.getId()), emp.getName(), String.valueOf(emp.getSalary()) };
				writer.writeNext(row);
			}
			System.out.println("CSV file written successfully: " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
