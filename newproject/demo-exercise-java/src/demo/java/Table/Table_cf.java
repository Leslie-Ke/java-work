package demo.java.Table;

public class Table_cf {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"X"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
