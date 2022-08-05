package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    private static final StringBuilder log = new StringBuilder();

    public static final String path = Paths.get("Game").toString();

    public static void main(String[] args) {
        makeDir(Paths.get("src").toString());
        makeDir(Paths.get("src", "main").toString());
        makeDir(Paths.get("src", "test").toString());
        makeFile(Paths.get("src", "main").toString(), "Main.java");
        makeFile(Paths.get("src", "main").toString(), "Utils.java");
        makeDir(Paths.get("res").toString());
        makeDir(Paths.get("res", "vectors").toString());
        makeDir(Paths.get("res", "drawables").toString());
        makeDir(Paths.get("res", "icons").toString());
        makeDir(Paths.get("saveGames").toString());
        makeDir(Paths.get("temp").toString());
        makeFile(Paths.get("temp").toString(), "temp.txt");

        flushLog();
    }

    private static void makeFile(String dir, String name) {
        File file = new File(Paths.get(path, dir).toString(), name); //файл
        try {
            if (file.createNewFile()) {
                log.append("Файл " + name + " был создан\n");
            } else {
                log.append("Файл " + name + " не был создан\n");
            }
        } catch (IOException ex) {
            log.append("Файл " + name + " не был создан. Ошибка: " + ex.getMessage() + "\n");
        }
    }

    private static void makeDir(String dirPath) {
        File dir = new File(Paths.get(path, dirPath).toString()); //создание каталога
        if (dir.mkdir()) {
            log.append("Каталог " + dirPath + " создан\n");
        } else {
            log.append("Каталог " + dirPath + " не создан\n");
        }
    }

    private static void flushLog() {
        try (FileWriter writer = new FileWriter(Paths.get(path, "temp", "temp.txt").toString(), false)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}