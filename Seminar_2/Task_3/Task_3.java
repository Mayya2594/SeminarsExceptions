package Seminar_2.Task_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        String path = "C:\\Личное\\Учеба\\Исключения в программировании\\SeminarsExceptions\\Seminar_2\\Task_3\\names.txt";
        List<String[]> list = readFile(path);
        modificationArray(list);
        writeFile(list, path);
    }

    public static List<String[]> readFile(String path) {
        List<String[]> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = reader.readLine()) != null) {
                list.add(line.split("="));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static void modificationArray(List<String[]> list) {
        for (String[] item : list) {
            if (!item[1].equals("?") && !checkNumber(item[1]))
                throw new IllegalArgumentException("Некорректное значение");
            if (item[1].equals("?"))
                item[1] = String.valueOf(item[0].length());
        }
    }

    public static boolean checkNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void writeFile(List<String[]> list, String path) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (String[] item : list) {
                writer.write(item[0] + "=" + item[1] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
