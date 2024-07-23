import java.io.*;
public class Text4point4 {
    public static void main(String[]args){
        int n =-1;
        File f = new File("hello.txt");
        char[]a = "您好 hello".toCharArray();
        try {
            FileWriter out = new FileWriter(f);
            out.write(a);
            out.close();
            FileReader in = new FileReader(f);
            char[]tom = new char[3];
            int m = in.read(tom);
            String s = new String(tom,0,m);
            System.out.println(m + "," + s);
            m = in.read(tom);
            s= new String(tom,0,m);
            System.out.println(m + "," + s);
            m = in.read(tom);
            s= new String(tom,0,m);
            System.out.println(m + "," + s);
            m = in.read(tom);
            System.out.println(m);
        }
        catch (IOException e){}
    }
}
