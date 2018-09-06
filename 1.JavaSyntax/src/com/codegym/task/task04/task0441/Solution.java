package com.codegym.task.task04.task0441;


/* 
Somehow average
ā
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        if (num1>=num2 && num2>=num3)
            System.out.print(num2);
        else if (num3>=num2 && num2>=num1)
            System.out.print(num2);

        else if (num2>=num3 && num3>=num1)
            System.out.print(num3);
        else if (num1>=num3 && num3>=num2)
            System.out.print(num3);

        else if (num3>=num1 && num1>=num2)
            System.out.print(num1);

        else if (num2>=num1 && num1>=num3)
            System.out.print(num1);
/*ā
        else
            System.out.print(num1);
*/

    }
}
