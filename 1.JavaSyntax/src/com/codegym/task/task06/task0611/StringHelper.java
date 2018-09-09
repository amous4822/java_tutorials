package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s;
        //write your code here
        return result+result+result+result+result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //write your codāe here

        for (int a=0;a<count; a++)
            result += s;

        return result;
    }

    public static void main(String[] args) {

    }
}
