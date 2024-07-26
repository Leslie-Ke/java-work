package demo.java.score;

import java.util.Scanner;

public class GetScore {
    public static void main(String[] args) {
        int max;
        int min;
        int average;
        System.out.println("请输入评委人数");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        calculate(n);
    }

    public static void calculate(int n) {
        int[] Score = new int[n];
        int max = Score[0];
        int sum = 0;
        int average;
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入第" + (i + 1) + "位评委的分数");
            Score[i] = sc.nextInt();
        }
        int min = Score[0];
        for (int i = 0; i < n; i++) {
            if (max < Score[i]) {
                max = Score[i];
            }
            if (min > Score[i]) {
                min = Score[i];
            }
            sum += Score[i];
        }
        average = (sum - max - min) / (Score.length - 2);
        System.out.println("平均分为" + average + "，最大值是" + max + ",最小值是" + min);

    }
}
