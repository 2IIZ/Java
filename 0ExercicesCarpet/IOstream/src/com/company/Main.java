package com.company;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        File f = new File("file.ivan");

        System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
        System.out.println("Nom du fichier : " + f.getName());
        System.out.println("Est-ce qu'il existe ? : " + f.exists());
        System.out.println("Esc-ce un répertoire ? : " + f.isDirectory());
        System.out.println("Est-ce un fichier ? : " + f.isFile());





    }
}
