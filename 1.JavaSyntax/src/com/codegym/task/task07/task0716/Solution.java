package com.codegym.task.task07.task0716;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); //0
        list.add("love"); //1
        list.add("lyre"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //write your code here

        for (int a=0; a < list.size(); a++){

            String str = list.get(a);


            if (str.contains("r") && str.contains("l") )
                continue;

            else if (str.contains("l")) {
                list.add(a,str);
                a++;
            }

            else if (str.contains("r"))
                list.remove(a--);

        }

        return list;
    }
}

/*
R or L

*/
