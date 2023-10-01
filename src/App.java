import Kendaraan.sepedaMotor;
import pabrikan.HandoBeat;
import pabrikan.YahamaMoi;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Stevent Rangga Ramaditya");
        System.out.println("1302210106");
        System.out.println("");

        sepedaMotor motor = new sepedaMotor("Black");
        HandoBeat honda = new HandoBeat("White");
        YahamaMoi yamaha = new YahamaMoi("Cyan");

        System.out.println("\n");
        System.out.println("Motor");
        motor.jalan();
        System.out.println("##Motor mengisi bensin##");
        motor.isiTankiFull();
        motor.jalan();

        System.out.println("\n");
        System.out.println("Honda");
        honda.jalan();
        System.out.println("##Motor mengisi bensin##");
        honda.isiTankiFull();
        honda.jalan();

        System.out.println("\n");
        System.out.println("Yamaha");
        yamaha.jalan();
        System.out.println("##Motor mengisi bensin##");
        yamaha.isiTankiFull();
        yamaha.jalan();
    }
}
