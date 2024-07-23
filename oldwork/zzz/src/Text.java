import java.io.*;
public class Text {
    public static void main(String[] args) {
        File f = new File("D:\\zzz\\src","Text.java");
        boolean boo = f.canRead();
        System.out.println(f.getName()+"是可读的吗:"+boo);
        long length = f.length();
        System.out.println(f.getName()+"的长度:"+length);
        System.out.println(f.getName()+"的绝对路径:"+f.getAbsolutePath());
        File file = new File(".\\myMusic" );
        boo = file.mkdir();
        if (boo){
            System.out.println("在当前目录下创建子目录:"+file.getName());
        }
        else {
            System.out.println(file.getName()+"已存在");
        }
        File dir = new File(".");
        File [] allFiles =dir.listFiles();
        System.out.println("在当前目录下的全部文件:");
        for (int i = 0;i<allFiles.length;i++){
            if (allFiles[i].isFile()) {
                System.out.println(allFiles[i].getName());
            }
        }
    }
}
