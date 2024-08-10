package demo.java.Movie;

public class movieoperate {
    private movie[] movies;
    public movieoperate(movie[] movies){
        this.movies = movies;
    }
//打印电影信息功能
    public void printfAllmovies(){
        System.out.println("---------系统全部电影如下:-------------");
        for (int i = 0; i < movies.length; i++) {
            movie m = movies[i];
            System.out.println("编号:"+ m.getId());
            System.out.println("名称:"+ m.getName());
            System.out.println("价格:"+ m.getPrice());
            System.out.println("----------------------------");
        }
    }
    public void searchmovie(int id){
        for (int i = 0; i <  movies.length; i++) {
            movie m = movies[i];
            if (m.getId() == id){
                System.out.println("该电影详情如下:");
                System.out.println("编号"+m.getId());
                System.out.println("名称"+m.getName());
                System.out.println("价格"+m.getPrice());
                System.out.println("得分"+m.getScore());
                System.out.println("导演"+m.getDirector());
                System.out.println("主演"+m.getActor());
                return;
            }
        }
        System.out.println("没有该电影信息");
    }
}
