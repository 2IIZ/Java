package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world !");

        Scanner sc = new Scanner(System.in);

        System.out.println("I need some letters to eat !! I'm hungryy fgrgrrr...");
        String str = sc.nextLine();
        System.out.println("Your '"+ str +"' food was very good food !");

        System.out.println("Now I need some 'Dessert' numbers ! grrh");
        long number = sc.nextLong();

        System.out.println("JE VAIS TOUT MANGER UN PAR UN !!");

        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        for (long i = number; 0 < i; i--){
            System.out.println(i);
        }

        System.out.println("Your dessert '"+ number +"' was incredible food !!");

    }
}
