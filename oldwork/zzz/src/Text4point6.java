import java.io.IOException;
import java.io.RandomAccessFile;

public class Text4point6 {
    public static void main(String[] args) {
        RandomAccessFile in =null,out = null;
        try {
            in = new RandomAccessFile("poem.txt","r");
            long length = in.length();
            long position = 0;
            in.seek(position);
            int i = 0;
            while (position<length){
                String str = in.readLine();
                byte b[] = str.getBytes("iso-8859-1");
                str = new String(b);
                position = in.getFilePointer();
                System.out.println(str);
            }
        }
        catch(IOException e){ }
    }
}
