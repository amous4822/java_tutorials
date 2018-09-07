package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //write your code hereā
        Scanner input = new Scanner(System.in);
        return input.nextLine();

    }

    public static int readInt() throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    public static double readDouble() throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        return input.nextDouble();

    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        return input.nextBoolean();

    }

    public static void main(String[] args) {

    }
}
