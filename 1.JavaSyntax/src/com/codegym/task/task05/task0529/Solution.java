package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        int sum=0;
        String text;

        for (;1!=0;){

            text=input.nextLine();
            if(text.equals("sum"))
                break;
            else{

                sum=sum+Integer.parseInt(text);

            }

        }

        System.out.print(sum);


    }
}
