package com.codegym.task.task06.task0609;

/* 
Distance between two pointāsā

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
        double ans = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1) ) );
        return ans;
    }

    public static void main(String[] args) {

    }
}