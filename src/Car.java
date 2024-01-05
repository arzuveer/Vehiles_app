public class Car extends Vehicles {
    private int wheels;
    private String type;
    private int doors;
    private int gear;
    private boolean isManual;
    private int currGear;
    private int seats;

    public Car(String name, int wheels, String type, int doors, int gear, boolean isManual, int seats) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.currGear = 1;
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrGear() {
        return currGear;
    }

    public void setCurrGear(int currGear) {
        this.currGear = currGear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void changeGear(int newGear)
    {
        this.currGear= newGear;
        System.out.println("changeGear method called-current gear changed to: "+ currGear);
    }
    public void chamgeSpeed(int speed, int direction)
    {
        super.move(speed, direction);
        System.out.println("changeSpeed method called-the speed is changed to: "+ speed +"direction is changed to: "+ direction);
    }
}
