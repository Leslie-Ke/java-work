class SpeakElephant1 extends Thread{
    public void run(){
        for (int i=1;i<=20;i++){
            System.out.print("大象"+i+" ");
        }
    }
}
class SpeakCar1 extends Thread{
    public void run(){
        for (int i=1;i<=20;i++){
            System.out.print("轿车"+i+" ");
        }
    }
}

class ElephantTarget implements Runnable{
    public void run(){
        for (int i=1;i<=20;i++){
            System.out.print("大象"+i+" ");
        }
    }
}
class  CarTarget implements Runnable{
    public void run(){
        for (int i=1;i<=20;i++){
            System.out.print("轿车"+i+" ");
        }
    }
}

public class Text9_2 {
    public static void main(String[] args) {
        Thread speakElephant1;
        Thread speakCAr1;
        ElephantTarget elephant;
        CarTarget car;
        elephant = new ElephantTarget();
        car = new CarTarget();
        speakElephant1 = new Thread(elephant);
        speakCAr1 = new Thread(car);
        speakElephant1.start();
        speakCAr1.start();
        for (int i=1;i<=15;i++){
            System.out.print("主人"+i+" ");
        }
    }
}
