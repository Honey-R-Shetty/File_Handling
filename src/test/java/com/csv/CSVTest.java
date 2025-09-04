package com.csv;

import org.junit.jupiter.api.Test;

import com.opencsv.exceptions.CsvValidationException;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CSVTest {

    @Test
    void testWriteToCSV_Positive() {
        String file = "src/test/resources/test_employees.csv";
        WriteToCsv.writeToCSV(file);
        File csvFile = new File(file);
        assertTrue(csvFile.exists());
        assertTrue(csvFile.length() > 0);
    }

    @Test
    void testReadFromCSV_Positive() throws CsvValidationException {
        String file = "src/test/resources/test_employees.csv";
        WriteToCsv.writeToCSV(file);
        ReadWriteCSV.readFromCsv(file);
    }

    @Test
    void testReadFromCSV_Negative() {
        String file = "non_existing.csv";
        assertDoesNotThrow(() -> ReadWriteCSV.readFromCsv(file));
    }

}
