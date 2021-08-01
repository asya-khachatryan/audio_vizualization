package util;

import model.*;
import exceptions.*;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    private CsvReader() {
    }

    public static List<String> readFromFile(File filename) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.ready()) {
                list.add(reader.readLine());
            }
        } catch (IOException e) {
            throw new AppRuntimeException("File not found");
        }
        return list;
    }
}
