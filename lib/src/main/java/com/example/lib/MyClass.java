package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate summary of 1 to N");
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 1 ;i <=N;i++){
            sum +=i;
        }
        System.out.println("Total: "+sum);
    }
}