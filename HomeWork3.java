package ru.geekbrains.java1.Homeworks;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        invertArr();
        System.out.println("\nЗадание 2");
        fillMass();
        System.out.println("\nЗадание 3");
        doubleSome();
        System.out.println("\nЗадание 4");
        fillInDiagonal();
        System.out.println("\nЗадание 5");
        createMassive(3,5);
        System.out.println("\nЗадание 6");
        minMax();
        System.out.println("\nЗадание 7");
        System.out.println(checkBalance());
        System.out.println("\nЗадание 8");
        elementsShift(new int[] {3, 8, 5, -16, 500, -6}, 2);
    }
    private static void elementsShift(int[] arr, int a) {
          for (int score = 0; score < a; score++){
                int s = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    int j = i +1;
                    arr[i] = arr[j];
                } arr[(arr.length - 1)] = s;
          }
         System.out.println(Arrays.toString(arr));
    }

    private static boolean checkBalance() {
        int[] kit = {2, 2, 2, 1, 2, 2, 10, 1};
        int allSum = 0;
        for (int s : kit) {
            allSum = allSum + s;
        }
        int firstSum = 0;
        int secondSum = 0;
        for (int s : kit) {
            firstSum = firstSum + s;
            secondSum = allSum - firstSum;
            if (firstSum == secondSum) {
                break;
            }
        }
        return (firstSum == secondSum);
    }

    private static void minMax() {
        int[] set = {1, 15, 0, -3, 70, 180, 250, -51};
        int max = set[1];
        for (int s : set) {
            if (s > max) {
                max = s;
            }
        }
        System.out.println("Максимальное число в массиве = " + max);
        int min = set[1];
        for (int s : set) {
            if (s < min) {
                min = s;
            }
        }
        System.out.println("Наименьшее значение в массиве = " + min);
    }

    private static void createMassive(int len, int initialValue) {//совсем примитивное задание, мож я неправильно поняла
        int[] massive = new int[len];
        for (int i = 0; i < len; i++){
            massive[i] = initialValue;
            System.out.print(massive[i] + " ");
        } System.out.println();
    }

    private static void fillInDiagonal() {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j || i == table.length - 1 - j) {
                    table[i][j] = 1;
                } System.out.print(table[i][j] + "   ");
            } System.out.println();
        }
    }

    private static void doubleSome() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void fillMass() {
        int[] mass = new int[100];
        int score = 0;
        for (int i = 0; i < mass.length; i++){
            mass[i] = i + 1;
                System.out.print(mass[i] + " ");
                score = score + 1;
            if (score % (mass.length/4) == 0){
                System.out.println();
              }
        }
    }

    private static void invertArr() {
        int[] arr = {1, 1, 0, 1, 0, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}



