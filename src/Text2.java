import java.io.*;
public class Text2 {
    public static void main(String[] args) {
        byte [] a="新年快乐".getBytes();
        byte [] b ="Happy New Year".getBytes();
        File file = new File("hello.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            System.out.println(file.getName()+"的大小"+file.length());
            out.write(a);
            out.close();
            out = new FileOutputStream(file,true);
            System.out.println(file.getName()+"的大小"+file.length());
            out.write(b,0,b.length);
            System.out.println(file.getName()+"的大小"+file.length());
            out.close();
        }
        catch (IOException e){
            System.out.println("Error"+e);
        }
    }
}
