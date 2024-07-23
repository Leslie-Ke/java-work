package small.games.random;

import java.util.Random;
import java.util.Scanner;

public class Randow {
    public static void main(String[] args) {
        Random random = new Random();
        int luckynumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入猜测的数字：");
            int guessnumber = scanner.nextInt();

            if(guessnumber<luckynumber){
                System.out.println("猜测的数小了。。。");
            }
            else if (guessnumber>luckynumber){
                System.out.println("猜测的数大了。。。");
            }
            else {
                System.out.println("猜对了!");
                break;
            }
        }
    }
}
