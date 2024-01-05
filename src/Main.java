public class Main {
    public static void main(String[] args) {

        F1 mercedes= new F1("Mercedes",false);
        mercedes.move(45,0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        mercedes.stop();

        Boat steamer= new Boat("steamer",5000);
        System.out.println("Boat capacity: "+steamer.getVehicleCapacity());
        System.out.println("Boat name: "+steamer.getVehicleName());

    }
}