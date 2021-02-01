package com.alpha.test1;

/*
-описывает трехзначное целое число number = 123;
−находит и выводит на консоль разность между числом  numberи числом,
составленным из цифр числа number,
но взятых в обратном порядке (для данного задания обратное число – это 321).
 */

public class Main {

    public static void main(String[] args) {

    int number = 123;

    int digit_1 = number % 10;
    number /= 10;

    int digit_2 = number % 10;
    number /= 10;

    int digit_3 = number % 10;

    System.out.println("Reverse number: " + digit_1 + digit_2 + digit_3);
    }
}
