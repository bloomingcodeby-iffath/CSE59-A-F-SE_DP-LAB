class Sensor {
    String name;
    int batteryLevel;
    
    Sensor(String name, int batteryLevel){
        this.name=name;
        this.batteryLevel=batteryLevel;
    }

    void charge(){
        batteryLevel=100;
        System.out.println("Sensor fully charged!");
    }
}
public class MAin4 {
    public static void main(String[] args) {
         Sensor s = new Sensor("Temparature Sensor", 25);

         s.charge();

         System.out.println("Battery Level: " + s.batteryLevel);
    }
}

