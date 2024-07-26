package demo.java.copyarr;

import java.util.Scanner;

public class CopyArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组元素个数");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("请输入第"+(i+1)+"位元素的数据");
            arr1[i] = sc.nextInt();
        }
        System.out.println("正在拷贝数组的数据给另一个数组");
        int arr2[] = copy(arr1);

    }
    public static int[] copy(int[] arr1){
        int arr2[] = new int[arr1.length];
        System.out.println("成功拷贝，其值为");
        System.out.print("{");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        System.out.print(i == arr1.length-1 ? arr2[i]:arr2[i]+" ,");
        }
        System.out.println("}");
        return arr2;
    }
}
