package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int a=0; a<10; a++)
            list.add(Integer.parseInt(reader.readLine()));

        for (int a=list.size()-1; a>=0; a--)
            System.out.println(list.get(a));

    
    }

}
