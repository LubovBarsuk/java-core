package ru.top.someHomeWork;

//Задание 3. Сумма цифр числа
//Дано натуральное число N. Вычислите сумму его цифр.
//Ввод: 179
//Вывод: 17

import java.util.Scanner;

public class JunitRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число:");
        int userNumber = scanner.nextInt();
        System.out.println(reverse(userNumber));
    }

    public static int reverse(int number) {
        if ((number + 9) / 10 == 0) {
            return number;
        }
        return number % 10 + reverse(number / 10);
    }
}
