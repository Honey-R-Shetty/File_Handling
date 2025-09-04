package com.csv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteCSV {

    public static void main(String[] args) throws CsvValidationException {
        String file = "src/main/resources/employees.csv";
        readFromCsv(file);
    }

    public static void readFromCsv(String filePath) throws CsvValidationException {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] row;
            System.out.println("Reading CSV file:");
            while ((row = reader.readNext()) != null) {
                System.out.println(String.join(", ", row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
