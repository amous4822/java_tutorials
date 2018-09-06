package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum =Integer.parseInt(reader.readLine()) ;
        int max,temp;

        temp =Integer.parseInt(reader.readLine()) ;
        max=temp;
        for(int a=1;a<maximum;a++){

            temp =Integer.parseInt(reader.readLine()) ;
            if(temp>max)
                max=temp;

        }



        //write your code here

        System.out.println(max);
    }
}
