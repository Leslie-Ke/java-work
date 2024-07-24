package demo.java.ticket;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要预定的舱位：");
        String type =sc.next();
        System.out.println("请输入当前月份：");
        int month = sc.nextInt();
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        calculate(price,month,type);
    }
    public static void calculate(double price,int month,String type){
            switch (type){
                case "头等舱":
                    if(month > 5 && month < 10) {
                        price = price * 0.9;
                    }else {
                        price = price*0.7;
                    }
                    break;
                case "经济舱":
                    if(month > 5 && month < 10) {
                    price = price*0.85;
                    }else {
                        price = price*0.65;
                    }
                    break;
                default:
                    System.out.println("您输入的舱位有问题，请重新检查...");
                    break;
            }
            System.out.println("您的优惠价是"+price);
        }
    }
