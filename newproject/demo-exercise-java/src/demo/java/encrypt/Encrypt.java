package demo.java.encrypt;

import java.util.Scanner;

//完成数据加密，数据加密方法为先加5在%10最后反转数组
public class Encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密数据的位数:");
         int n = sc.nextInt();
        Define(n);
    }
    public static void Define(int n){
        String date = "";
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("请输入第"+(i+1)+"位数据(只能输入一位)");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        for (int i = 0,j=numbers.length-1; i < j; i++,j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] =  temp;
        }
        for (int i = 0; i <numbers.length ; i++) {
            date += numbers[i];
        }
        System.out.println("最后加密结果为:"+ date);
    }

}
