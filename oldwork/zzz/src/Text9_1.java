class SpeakElephant extends Thread{
    public void run(){
        for (int i=1;i<=20;i++){
            System.out.print("大象"+i+" ");
        }
    }
}
class SpeakCar extends Thread{
    public void run(){
        for (int i=1;i<=20;i++){
            System.out.print("轿车"+i+" ");
        }
    }
}

public class Text9_1 {
    public static void main(String[] args) {
        SpeakElephant speakElephant;
        SpeakCar speakCar;
        speakCar=new SpeakCar();
        speakElephant = new SpeakElephant();
        speakElephant.start();
        speakCar.start();
        for (int i=1;i<=15;i++){
            System.out.print("主人"+i+" ");
        }
    }
}
