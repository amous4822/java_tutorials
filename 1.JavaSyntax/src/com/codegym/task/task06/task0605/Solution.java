package com.codegym.task.task06.task0605;


import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.bmi(weight, height);
    }

    public static class Body {
        public static void bmi(double weight, double height) {
            //write your cāode here
            double bmi = weight/(height*height);

            if (bmi < 18.5)
                System.out.print("Underweight: BMI < 18.5");
            else if (18.5 <= bmi && bmi < 24.9)
                System.out.print("Normal: 18.5 <= BMI < 24.9");
            else if (25 <= bmi && bmi < 29.9)
                System.out.print("Overweight: 25 <= BMI < 29.9");
            else
                System.out.print("Obese: BMI >= 30");


        }
    }
}

/*
Controlling body weight

*/
