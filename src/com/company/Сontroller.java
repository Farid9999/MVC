package com.company;

import java.io.*;
import java.util.Scanner;

public class Сontroller {

    private Model model;
    private String[] notSaveWords;

    public Сontroller() throws IOException {
        notSaveWords = new String[]{"Hello" , "World" , "Home" , "Cat" , "Dog"};
        model = new Model("demoFile.txt");
    }

    public boolean checkWordSave(String word) throws IOException {
        for (String tmpWord:notSaveWords) {
            if (tmpWord.equals(word)){
                return true;
            }
        }
        model.write(word);
        return false;
    }

    public String read() throws FileNotFoundException {
        return model.read();
    }

    public boolean addRazdelitel(String razdelitel) throws IOException {
        if (razdelitel.length()!=1){
            return false;
        }

        model.addRazdelitel(razdelitel);
        return true;
    }

}
