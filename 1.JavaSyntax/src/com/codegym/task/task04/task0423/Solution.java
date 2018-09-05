package com.codegym.task.task04.task0423;

/* 
Bouncer policy

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        BufferedReader name=new BufferedReader(new InputStreamReader(System.in));

        String name1=name.readLine();

        int num1 = input.nextInt();

        if (num1 > 20)
            System.out.println("18 is old enough");
    }
}
