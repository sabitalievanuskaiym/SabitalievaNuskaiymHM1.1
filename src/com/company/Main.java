package com.company;

public class Main {

    public static void main(String[] args) {
        String myFirstHm;
        final int NUM = 1010;
        String word = "Good luck";
        myFirstHm = NUM + word;
        System.out.println("My first homework->" + NUM + word + myFirstHm);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");

        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        // ДЗ на сообразительность
        System.out.println("Введите ваше имя");
        String Name;
        Name = "Nuskaiym";
        System.out.println("Hello " + Name);


    }
}
