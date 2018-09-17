package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите факториал натурально числа n : ");
            n = scan.nextInt();
            int result = 1;
            for (int i = 2; i <= n; i++)
                result *= i;
            System.out.println(result);
            if (n == 0 || n == 1)
                System.out.println(result);
            if(n < 0)
                System.out.println("Вы ввели отрицательный факториал!");
        } while (n < 0);
        System.out.println("Конец");


    }
}
