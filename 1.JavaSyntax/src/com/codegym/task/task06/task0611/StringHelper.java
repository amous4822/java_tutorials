package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "acde";
        //write your code here
        //result =s.substring(0,s.length()/5);
        for (int a=0;a<5;a++)
            System.out.println(result);

          /*  if(!result.equals(s.substring((5*a), 5*a + s.length()/5)));
                result="";*/


        return result;
    }

    public static String multiply(String s, int count) {
        String result = "efdas";
        //write your code here
        //result =s.substring(0,s.length()/count);
        for (int a=0;a<count;a++)
            System.out.println(result);

          /*  if(!result.equals(s.substring((count*a), count*a + s.length()/count)));
                result="";
*/
        return result;
    }

    public static void main(String[] args) {

    }
}
