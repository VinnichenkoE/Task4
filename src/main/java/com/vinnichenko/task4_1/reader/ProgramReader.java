package com.vinnichenko.task4_1.reader;

import com.vinnichenko.task4_1.exception.ProgramException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProgramReader {

    public String readFile() throws ProgramException {
        BufferedReader br = null;
        String numbers;
        Path path = Paths.get("src/main/resources/data/array.txt");
        try {
            br = Files.newBufferedReader(path);
            numbers = br.readLine();

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
        return numbers;
    }

    public String readConsole() throws ProgramException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input length of array");
        String input = "";
        StringBuilder sb = new StringBuilder();
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            throw new ProgramException("can not read line");
        }
        int length = Integer.parseInt(input);
        for (int i = 0; i < length; i++) {
            System.out.println("Input " + i + " element");
            try {
                input = bufferedReader.readLine();
            } catch (IOException e) {
                throw new ProgramException("can not read line");
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            sb.append(input).append(" ");
        }
        return sb.toString();
    }
}
