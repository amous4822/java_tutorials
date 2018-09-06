package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        Man man1 = new Man("s",19,"x-y-z");
        Man man2 = new Man("h",19,"x-y-z");

        Woman woman1 = new Woman("e",19,"x-y-z");
        Woman woman2 = new Woman("abs",35,"x-y-z");

        man1.display();
        man2.display();
        woman1.display();
        woman2.display();
        //āā

    }

    //write your code here
    public static class Man {
        String name,address;
        int age;

        public Man() {
            this("unknown",0,"unknown");
        }

        public Man(String name,int age,String address) {
            this.name=name;
            this.age=age;
            this.address=address;
        }

        public Man(String name, int age) {
            this.name=name;
            this.age=age;

        }
        public Man(String name) {
            this.name=name;
        }

        public void display(){
            System.out.println(this.name+ " " +this.age+ " "+ this.address);
        }
    }

    public static class Woman {
        String name,address;
        int age;

        public Woman() {
            this("unknown",0,"unknown");
        }

        public Woman(String name,int age,String address ) {
            this.name=name;
            this.age=age;
            this.address=address;
        }

        public Woman(String name, int age) {
            this.name=name;
            this.age=age;

        }
        public Woman(String name) {
            this.name=name;
        }

        public void display(){
            System.out.println(this.name+ " "+ this.age+ " "+ this.address);
        }

    }
}
