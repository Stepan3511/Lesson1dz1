package ru.stepan.lesson1;

public class HomeWorkApp {

        public static void main(String[] args){

            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

        }
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        public static void checkSumSign() {
            int a = 7, b = 20, c = a + b;

            if (c >= 0) {
                System.out.println("Сумма положительная");
            }
            else {
                System.out.println("Сумма отрицательная");
            }
        }

        public static void printColor() {
            int value = 130;

            if (value <= 0) {
                System.out.println("Красный");
            }
            if (value <= 100 && value >0) {
                System.out.println("Желтый");
            }
            if (value > 100) {
                System.out.println("Зеленый");
            }
        }

        public static void compareNumbers() {
            int a = 17;
            int b = 28;

            if (a >= b) {
                System.out.println("a >= b");
            }
            else {
                System.out.println("a < b");
            }
        }

    }




