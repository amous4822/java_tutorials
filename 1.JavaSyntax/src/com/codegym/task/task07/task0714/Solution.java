package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int a=0; a<5; a++)
            list.add(input.readLine());

        list.remove(2);

        for (int a=list.size()-1; a>=0; a--)
            System.out.println(list.get(a));
    }
}


