package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String s = input.readLine();
        String p =input.readLine();
        int num=Integer.parseInt(p);

        while(num!=0){
            System.out.println(s);
            num--;
        }

    }
}
