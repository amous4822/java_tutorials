
package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[10];
        for (int a = 0; a < 8; a++)
            str[a] = input.readLine();

        for (int a = 9; a >= 0; a--)
            System.out.println(str[a]);

    }
}