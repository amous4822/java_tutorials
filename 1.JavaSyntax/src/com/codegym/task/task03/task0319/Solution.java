package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String name= input.readLine();
        String no1= input.readLine();
        String no2= input.readLine();

        System.out.print(name + " will receive " + no1 + " in " + no2 + " years.");


    }
}
