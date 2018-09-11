package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in timeā

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int n =Integer.parseInt(reader.readLine());
        int m= Integer.parseInt(reader.readLine());

        for (int a=0; a<n; a++)
            list.add(reader.readLine());

        for (int a=0; a<m; a++)
            list.add(list.remove(0));

        for (int a=0; a<list.size(); a++)
            System.out.println(list.get(a));
        //wārite your code āhereā
    }
}
