package demo.java.randomNumber;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        creatnumber();
    }
    public static void creatnumber(){
        String [] Final = new String[6];
        String [] random = new String[6];
        for (int i = 0; i <6 ; i++) {
            int temp;
            Random rd = new Random();
            temp = rd.nextInt(3);
            if (temp == 0) {
                random[i] = String.valueOf(rd.nextInt(10));
                }
            else if (temp == 1){
                random[i] = String.valueOf((char)(rd.nextInt(26)+65));
                //String.valueOf()将随机生成的整数或字符转换为字符串类型，确保类型匹配
                }
            else {
                random[i] = String.valueOf((char)(rd.nextInt(26)+97));
                }
            }
        System.out.println("您的验证码为：");
        //for (String s : random) { System.out.print(s); } 称为 for-each 循环。它可以用来遍历数组或集合中的元素
        for (String s : random) {
            System.out.print(s);
        }
    }
}
