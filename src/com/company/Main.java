package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static final String path = "./Game";

    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();

        File dir1 = new File(path + "/src");
        if (dir1.mkdir()) {
            log.append("Каталог src создан\n"); //каталог срц
        } else {
            log.append("Каталог src не создан\n");
        }

        File dir2 = new File(path + "/src/main");
        if (dir2.mkdir()) {
            log.append("Каталог main создан\n"); //каталог срц
        } else {
            log.append("Каталог main не создан\n");
        } //каталог майн в срц

        File dir3 = new File(path + "/src/test"); //каталог тест в срц
        if (dir3.mkdir()) {
            log.append("Каталог test создан\n"); //каталог срц
        } else {
            log.append("Каталог test не создан\n");
        }


        File file1 = new File(path + "/src/main", "Main.java"); //файл майл в каталоге майн
        try {
            if (file1.createNewFile())
                log.append("Файл Main.java был создан\n");
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }

        File file2 = new File(path + "/src/main", "Utils.java"); //файл утилс в каталоге майн
        try {
            if (file2.createNewFile())
                log.append("Файл Utils.java был создан\n");
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }

        File dir4 = new File(path + "/res");
        if (dir4.mkdir()) {
            log.append("Каталог res создан\n"); //каталог рес
        } else {
            log.append("Каталог res не создан\n");
        } //создание каталога рес

        File dir5 = new File(path + "/res/vectors");// создание каталога векторс в каталоге рес
        if (dir5.mkdir()) {
            log.append("Каталог vectors создан\n");
        } else {
            log.append("Каталог vectors не создан\n");
        }

        File dir6 = new File(path + "/res/drawables");// создание дровблс векторс в каталоге рес
        if (dir6.mkdir()) {
            log.append("Каталог drawables создан\n");
        } else {
            log.append("Каталог drawables не создан\n");
        }

        File dir7 = new File(path + "/res/icons");// создание айконс векторс в каталоге рес
        if (dir7.mkdir()) {
            log.append("Каталог icons создан\n");
        } else {
            log.append("Каталог icons не создан\n");
        }

        File dir8 = new File(path + "/savegames"); //создание каталога сейвгейм
        if (dir8.mkdir()) {
            log.append("Каталог savegames создан\n");
        } else {
            log.append("Каталог savegames не создан\n");
        }

        File dir9 = new File(path + "/temp"); //создание каталога темп
        if (dir9.mkdir()) {
            log.append("Каталог temp создан\n");
        } else {
            log.append("Каталог temp не создан\n");
        }

        File file3 = new File(path + "/temp", "temp.txt"); //файл утилс в каталоге майн
        try {
            if (file3.createNewFile())
                log.append("Файл temp.txt был создан\n");
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(path + "/temp/temp.txt", false)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
