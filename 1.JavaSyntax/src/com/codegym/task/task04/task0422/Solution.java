package com.codegym.task.task04.task0422;

/* 
18+

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

            if (num1 < 18)
                System.out.println("Grow up a little more");


    }
}
