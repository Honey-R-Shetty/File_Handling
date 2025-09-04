package com.json;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class JsonTest {

	@Test
	void testWriteToJson_Positive() {
		String file = "src/test/resources/test_employees.json";
		WriteToJson.writeToJson(file);
		File jsonFile = new File(file);
		assertTrue(jsonFile.exists());
		assertTrue(jsonFile.length() > 0);
	}

	@Test
	void testReadFromJson_Positive() {
		String file = "src/test/resources/test_employees.json";
		WriteToJson.writeToJson(file);
		assertDoesNotThrow(() -> ReadFromJson.readFromJson(file));
	}

	@Test
	void testReadFromJson_Negative() {
		String file = "non_existing.json";
		try {
			ReadFromJson.readFromJson(file);
			fail("Expected exception but none was thrown");
		} catch (Exception e) {
			assertNotNull(e);
		}
	}
}
