package com.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadFromJson {

	public static List<Employee> readFromJson(String filePath) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(new File(filePath), new TypeReference<List<Employee>>() {
			});
		} catch (IOException e) {
			throw new RuntimeException(e); 
		}
	}

	public static void main(String[] args) {
		String file = "src/main/resources/employees.json";
		try {
			List<Employee> employees = readFromJson(file);
			employees.forEach(System.out::println);
		} catch (Exception ex) {
			System.out.println("Error reading JSON: " + ex.getMessage());
		}
	}
}
