package filehandling;

import java.io.*;

public class MergeMultipleFiles {
    public static void main(String[] args) throws IOException {
        String[] inputFiles = {
            "D:\\honey\\file1.txt",
            "D:\\honey\\file2.txt",
            "D:\\honey\\file3.txt"
        };
        String outputFile = "D:\\honey\\merged.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        for (String file : inputFiles) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
        }

        writer.close();
        System.out.println("Files merged successfully!");
    }
}
