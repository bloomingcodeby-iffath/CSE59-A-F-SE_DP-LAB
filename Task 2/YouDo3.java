class Countdown {
    void start(){
        for(int i=5; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("Go!");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Countdown c = new Countdown();
        c.start();
    }
}

