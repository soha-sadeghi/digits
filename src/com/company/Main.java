package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        System.out.println(mmToCc(m));
    }

    public static int mmToCc(int m) {
       m=m*1000;
        return m;

    }
}
