
import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;
public class Homework1 {

    /* Task 1:
        Написать метод, принимающий с клавиатуры положительное число и печатающий затем таблицу умножения для этого числа
        ( т.е. печатающий произведение этого числа на все числа от 1 до 10). Использовать в решении цикл for.
         */

        public static void main(String[] args) {
            //   multiplicationTable();
            printTriangle(6);
        }

        static void multiplicationTable() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a positive number:");
            int n = scanner.nextInt();
            System.out.println("Here you have your multiplication table for the number " + n + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
            scanner.close();
        }

    /*
    Переписать задачу про треугольник из предыдущего дз используя циклы for:
    Написать метод, выводящий на печать треугольник, состоящий из цифр от 1 до числа n такого вида:
    1
    12
    123
    1234
    12345
    123456
     */

        static void printTriangle(int n) {
            for (int i = 1; i <= n; i++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }

