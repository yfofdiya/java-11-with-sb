package com.simform.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileService {

    public void readFile() throws IOException {
        Path filePath = Paths.get("C:/Workspace_Practice/Java 11/test_read.txt");
        String fileContent = Files.readString(filePath, StandardCharsets.UTF_8);
        System.out.println(fileContent);
    }

    public void writeToFile() throws IOException {
        Path filePath = Paths.get("C:/Workspace_Practice/Java 11/test_write.txt");
        String fileContent = "How are you?";
        Files.writeString(filePath, fileContent, StandardCharsets.UTF_8);
        System.out.println("Success");
    }
}
