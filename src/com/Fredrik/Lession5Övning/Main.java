package com.Fredrik.Lession5Övning;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Öv 1
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Player #1: " + name );

        // Öv 2
        System.out.println("Give me a number");
        int x = scan.nextInt();
        for (int i = 0; i < x; i++){
            System.out.println(i + 1);
        }

        scan.nextLine();




    }



}
