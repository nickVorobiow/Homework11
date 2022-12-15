package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        task1
//        System.out.print("Введите год:");
//        int year = in.nextInt();
//        Solution.isLeapYear(year);

//        task2
        System.out.println("Выберите операционную систему:\n" +
                "\t0 - iOS\n" +
                "\t1 - Android");
        byte choice = in.nextByte();
        System.out.print("Введите год выпуска устройства:");
        int prodYear = in.nextInt();
        Solution.printMessage(choice, prodYear);

//        task3
//        int deliveryDistance = 40;
//        Solution.deliveryTime(deliveryDistance);
    }
}
