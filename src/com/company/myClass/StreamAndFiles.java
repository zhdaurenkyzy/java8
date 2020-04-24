package com.company.myClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAndFiles {
    private Path path = Paths.get("C:/Users/Жансая/IdeaProjects/java8/src/com/company/resources/file.txt");

    public void getStringByBufferedReader() {
        List<String> lines = new ArrayList<>();
        String line;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
        System.out.println(lines);
    }

    public void getStringByScanner() {
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
        System.out.println(lines);
    }

    public void getStringByFilesLine() {
        List<String> lines = new ArrayList<>();
        try (Stream<String> stream = Files.lines(path)) {
            lines = stream.collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
        System.out.println(lines);
    }
}
