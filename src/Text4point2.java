import java.io.*;

public class Text4point2 {
    public static void main(String[] args) {
        int n =1;
        try{
            File f = new File("D:\\zzz\\src","Text4point.java");
            InputStream in = new FileInputStream(f);
            while ((n=in.read())!=-1){
                System.out.println((char)n);
            }
            in.close();
        }
        catch (IOException e){
            System.out.println("File read Error"+e);
        }
        byte[] a=new byte[100];
        try{
            File f =new File("D:\\zzz\\src","Text4point2.java");
            InputStream in =new FileInputStream(f);
            while ((n=in.read(a,0,100))!=-1){
                String s =new String(a,0,n);
                System.out.print(s);
            }
            in.close();
        }
        catch (IOException e){
            System.out.println("File read Error"+e);
        }
    }
}
