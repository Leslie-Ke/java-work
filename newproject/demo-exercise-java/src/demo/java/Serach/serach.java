package demo.java.Serach;

public class serach {
    public static void main(String[] args) {
        System.out.println("当前素数的个数是"+serachnum(100,200));
    }
    public static int serachnum(int start,int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
