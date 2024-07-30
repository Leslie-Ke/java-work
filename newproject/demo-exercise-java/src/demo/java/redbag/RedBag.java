package demo.java.redbag;

import java.util.Random;
import java.util.Scanner;

public class RedBag {
    public static void main(String[] args) {
        int money [] ={9,666,188,520,99999};
        Start(money);
    }
    public static void Start(int [] money){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.println("请你输入任意内容抽奖：");
            sc.next();
            while (true) {
                int index = r.nextInt(money.length);
                int my = money[index];
                if(my != 0){
                    System.out.println("恭喜你抽中红包"+my);
                    money[index] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束");
    }
}
