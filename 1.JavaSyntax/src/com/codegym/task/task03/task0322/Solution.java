package com.codegym.task.task03.task0322;


/* 
Deep and pure love

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String name1 = input.readLine();
        String name2 = input.readLine();
        String name3 = input.readLine();


        System.out.print( name1 +" + "+ name2+" + " + name3 + " = Pure love. Ooo la-la!");
    }
}