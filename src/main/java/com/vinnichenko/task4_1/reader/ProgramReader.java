package com.vinnichenko.task4_1.reader;

import com.vinnichenko.task4_1.exception.ProgramException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProgramReader {

    private static final String DEFAULT_PATH = "src/main/resources/data/array.txt"; // don't work with path "/data/array.txt"

    public String readFile(String filePath) throws ProgramException {
        BufferedReader br = null;
        String numbers;
        StringBuilder stringBuilder = new StringBuilder();
        if (filePath == null) {
            filePath = DEFAULT_PATH;
        }
        Path path = Paths.get(filePath);
        try {
            br = Files.newBufferedReader(path);
            while ((numbers = br.readLine()) != null) {
                stringBuilder.append(numbers).append(" ");
            }
        } catch (IOException e) {
            throw new ProgramException("can not find file");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringBuilder.toString();
    }

    public String readConsole() throws ProgramException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input length of array");
        String input;
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            throw new ProgramException("can not read line");
        }
        int length = Integer.parseInt(input);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (int i = 0; i < length; i++) {
                System.out.println("Input " + i + " element");
                input = bufferedReader.readLine();
                stringBuilder.append(input).append(" ");
            }
        } catch (IOException e) {
            throw new ProgramException("can not read line");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }
}
