import java.io.*;
public class Text4point3 {
    public static void main(String[]args) throws IOException {
        int n = -1;
        File f = new File("ok.txt");
        byte[]a = "abcdf".getBytes();
        try {
            FileOutputStream out = new FileOutputStream(f);
            out.write(a);
            out.close();
            FileInputStream in = new FileInputStream(f);
            byte[]tom = new byte[2];
            int m =in.read(tom);
            String s = new String(tom,0,m);
            System.out.println(m + ":" + s);
            m = in.read(tom);
            s = new String(tom,0,m);
            System.out.println(m + "," + s);
            m=in.read(tom);
            System.out.println(m);
        }
        catch (IOException e){}
    }
}
