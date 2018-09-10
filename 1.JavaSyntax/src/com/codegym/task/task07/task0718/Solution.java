package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here

        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list= new ArrayList<>();

        int check=0,ans=-1;

        for (int a=0; a<10; a++) {

            list.add(input.readLine());

            if (check < list.get(a).length())
                check = list.get(a).length();

            else {
                if (ans ==-1)
                    ans=a;
            }
        }
        if(ans!=-1)
            System.out.println(ans);



    }
}

