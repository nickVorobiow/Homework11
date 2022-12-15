package com.company;

import java.time.LocalDate;

public class Solution {
//    task1
    public static void isLeapYear(int year) {
        if (year % 100 == 0) {
            if ((year / 100) % 4 == 0) {
                System.out.println(year + " - високосный год");
            }
            else  {
                System.out.println(year + " - не високосный год");
            }
        }
        else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " - високосный год");
        }
    }

//    task2
    public static void printMessage(byte osVersion, int prodYear) {
        int currentYear = LocalDate.now().getYear();
        if ((byte)osVersion == 0 && prodYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ((byte)osVersion == 0 && prodYear == currentYear) {
            System.out.println("\nУстановите обычную iOS-версию");
        }

        if ((byte)osVersion == 1 && prodYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if ((byte)osVersion == 1 && prodYear == currentYear) {
            System.out.println("\nУстановите обычную Android-версию");
        }
    }

//    task3
    public static void deliveryTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + 3);
        }
    }
}
