package demo.java.Roll;

import java.util.Random;
import java.util.Scanner;

public class roll {
    public static void main(String[] args) {
        int [] usernumbers = UserSelectNumbers();
        System.out.println("输入的号码为");
        printArray(usernumbers);
        int []lucknumber = creatnuumber();
        System.out.println("中奖号为");
        printArray(lucknumber);
        judge(usernumbers,lucknumber);
    }
    public static void printArray(int []arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("}");
    }
    public static int[] UserSelectNumbers(){
        int numbers[] = new int[7];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < numbers.length-1; i++) {
            while (true){
                System.out.println("请输入第"+(i+1)+"个红球数（不可重复）1—33之间");
                int number = sc.nextInt();
                if(number<1 ||number>33){
                    System.out.println("您输入的红球数范围不再1—33之间");
                }else {
                    if(exist(numbers,number)){
                        System.out.println("输入重复");
                    }
                    else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true){
            System.out.println("输入篮球数(1-16)");
            int number = sc.nextInt();
            if(number<1||number>16){
                System.out.println("超过范围");
            }else {
                numbers[6]=number;
                break;
            }
        }
        return numbers;
    }
    public static boolean exist(int[] numbers,int number){
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i] == 0){
                break;
            }
            if(numbers[i] == number){
                return true;
            }
        }
        return false;
    }
    public static int[] creatnuumber(){
        int [] numbers = new int[7];
        Random r = new Random();
        for (int i = 0; i <numbers.length - 1 ; i++) {
            while (true){
                int number = r.nextInt(33)+1;
                if (!exist(numbers, number)) {

                    numbers[i] =number;
                    break;
                }
            }
        }
        numbers[6] = r.nextInt(16)+1;
        return numbers;
    }
    public static void judge(int[] userumbers,int lucknumber[]){
        int redcount = 0;
        int bluecount = 0;
        for (int i = 0; i <userumbers.length - 1 ; i++) {
            for (int j = 0; j <lucknumber.length - 1 ; j++) {
                if(userumbers[i] == lucknumber[j]){
                    redcount++;
                    break;
                }
            }
        }
        bluecount = userumbers[6] == lucknumber[6]?1:0;
        System.out.println("猜到的红球数为"+redcount);
        System.out.println("猜到的蓝球数为"+bluecount);
        switch (redcount){
            case 6:
                if(bluecount == 1){
                    System.out.println("中1000万");
                }else{
                    System.out.println("中500万");
                }
                break;
            case 5:
                if(bluecount == 1){
                    System.out.println("中3000元");
                }else{
                    System.out.println("中200元");
                }
                break;
            case 4:
                if(bluecount == 1){
                    System.out.println("中200元");
                }else{
                    System.out.println("中10元");
                }
                break;
            case 3:
                if(bluecount == 1){
                    System.out.println("中10元");
                }else{
                    System.out.println("感谢惠顾");
                }
                break;
            default:
                System.out.println("感谢惠顾");
                break;
        }
    }
}
