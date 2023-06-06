package org.example;

import java.util.List;

enum CalculatorOperation {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION
}
public class Main {
    public static void main(String[] args) {

        CalculatorOperation operation = CalculatorOperation.ADDITION;
        String fileName = "numbers.txt";
        Boolean printLogs = true;

        NumberFileReader fileReader = new NumberFileReader();
        List<Integer> numbers = fileReader.readNumbersFile(fileName);

        Calculator calculator = new Calculator();
        String result = calculator.calculate(numbers, operation, printLogs);
        System.out.println(result);

    }
}