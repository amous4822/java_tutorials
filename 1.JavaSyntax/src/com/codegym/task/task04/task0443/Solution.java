package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input=new Scanner(System.in);

        String name = input.nextLine();
        int year=input.nextInt();
        int mnth=input.nextInt();
        int day=input.nextInt();

        System.out.print("My name is "+name+"."+"\nI was born on "+mnth+"/"+day+"/"+year);
    }
}
