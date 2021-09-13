package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = input.nextInt();

        //Ternary operator = simplified if/else statement
        String msg =  age >=16
            ? "You are old enough to legally drive."
            : "You are not old enough to legally drive.";

        System.out.println(msg);
    }
}