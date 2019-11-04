package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập số sinh viên cần nhập điểm: ");
            size = input.nextInt();
        } while (size > 30);
        countPass(createArray(size));
    }

    public static int[] createArray(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        int point;
        for(int i = 0; i < arr.length; i++) {
            do {
                System.out.printf("Nhập điểm cho sinh viên thứ %d: ", i+1);
                arr[i] = input.nextInt();
                point = arr[i];
            } while (point < 0 || point > 10);
        }
        return arr;
    }

    public static void countPass(int[] arr) {
        int count = 0;
        for(int value: arr) {
            System.out.print(value + "\t");
            if(value >= 5) {
                count++;
            }
        }
        System.out.printf("\nSố sinh viên đã thi đỗ là %d",count);
    }
}
