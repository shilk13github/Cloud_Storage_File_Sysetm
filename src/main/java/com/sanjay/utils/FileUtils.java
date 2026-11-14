package com.sanjay.utils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static String getFileName(String filePath) {
        Path path = Paths.get(filePath);
        return path.getFileName().toString();
    }

    public static boolean fileExists(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }
}