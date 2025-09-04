package com.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteToJson {

	public static void writeToJson(String filePath) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Honey", 50000), new Employee(2, "Mani", 60000),
				new Employee(3, "Jaya", 55000));

		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), employees);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		String file = "src/main/resources/employees.json";
		writeToJson(file);
	}
}
