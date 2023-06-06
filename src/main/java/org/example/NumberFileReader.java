package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberFileReader {
    public List<Integer> readNumbersFile(String fileName) {
        List<Integer> numbers = new ArrayList<>();

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            while (line != null) {
                numbers.add(Integer.parseInt(line));
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
}
