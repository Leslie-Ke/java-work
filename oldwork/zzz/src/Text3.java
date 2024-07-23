import java.io.*;

public class Text3 {
    public static void main(String[] args) {
        File sourceFile = new File("d.txt");
        File targetFile = new File("c.txt");
        char c[] = new char[19];
        try{
            Writer out = new FileWriter(targetFile,true);
            Reader in = new FileReader(sourceFile);
            int n = 1;
            out.write('\n');
            while ((n=in.read(c))!=-1){
                out.write(c,0,n);
            }
            out.flush();
            out.close();
        }
        catch (IOException e){
            System.out.println("Error"+e);
        }
        System.out.println("更新后的"+targetFile.getName()+"内容");
        try{
            Reader in = new FileReader(targetFile);
            int n =1;
            while((n=in.read(c))!=-1){
                String str = new String(c,0,n);
                System.out.println(str);
            }
            in.close();
        }
        catch (IOException e){
            System.out.println("Error"+e);
        }
    }
}
