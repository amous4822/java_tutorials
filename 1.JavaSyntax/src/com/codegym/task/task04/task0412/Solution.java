package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader input= new BufferedReader( new InputStreamReader( System.in));
        String s = input.readLine();
        int num = Integer.parseInt(s);

        if(num>0)
            num*=2;
        else if(num<0)
            num++;
        else
            num=0;

        System.out.println(num);

    }

}