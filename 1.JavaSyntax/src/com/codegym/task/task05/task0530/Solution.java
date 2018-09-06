package com.codegym.task.task05.task0530;

import java.io.*;

/* 
Boss, something weird is happening
ā
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ab = reader.readLine();
        int a = Integer.parseInt(ab);
        ab = reader.readLine();
        int b = Integer.parseInt(ab);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
