package demo.java.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        movie[] movies = new movie[4];
        movies[0] = new movie(1,"水门桥",38.9,9.8,"徐克","吴京","12万人想看");
        movies[1] = new movie(2,"也一样",39,9,"徐克","吴京","12万人想看");
        movies[2] = new movie(3,"恩恩额",3,8,"徐克","吴京","12万人想看");
        movies[3] = new movie(4,"热热热",38,9,"徐克","吴京","12万人想看");
        movieoperate operate = new movieoperate(movies);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("========电影信息系统=========");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询详细信息");
            System.out.println("3.退出系统");
            System.out.println("请输入操作");
            int command = sc.nextInt();
            switch (command)
            {
                case 1:
                    operate.printfAllmovies();
                    break;
                case 2:
                    System.out.println("请输入id");
                    int id = sc.nextInt();
                    operate.searchmovie(id);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("输入命令错误");
                    break;
            }
        }

    }
}
