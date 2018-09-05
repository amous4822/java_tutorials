package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int num;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        num = Integer.parseInt(s);

        if(num==1)
            System.out.println("Monday");
        if(num==2)
            System.out.println("Tuesday");
        if(num==3)
            System.out.println("Wednesday");
        if(num==4)
            System.out.println("Thursday");
        if(num==5)
            System.out.println("Friday");
        if(num==6)
            System.out.println("Saturday");
        if(num==7)
            System.out.println("Sunday");

        if(num>7 || num<1)
            System.out.println("No such day of the week");






    }
}