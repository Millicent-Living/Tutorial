package com.lesson.helloworld;

public class HelloWorld {
    public static void main(String[] args){
        myName("Living");
        programme("Networking");
        level(200);
        countingLetters('a',100);


    }
    public static void myName(String firstName){
        System.out.println(firstName);
    }

    public static void programme(String course){
        System.out.println(course);
    }

    public static void level(int stage){
        System.out.println(stage);

    }
    public static void countingLetters(char alphabet, int num){
        System.out.println(alphabet +  num);
    }


}