package com.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        Scanner input=new Scanner(System.in);

        int num = input.nextInt();

        for(;num!=0;num/=10){

            if((num%10)%2==0)
                even++;
            else
                odd++;
        }

        System.out.print("Even: "+even+" Odd: "+odd);
    }
}
