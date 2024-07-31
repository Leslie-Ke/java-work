package demo.java.triangle;

import java.util.Scanner;

public class Trianglel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print(j%2 == 0?" ":"*");
            }
            System.out.println();
        }
    }
}
