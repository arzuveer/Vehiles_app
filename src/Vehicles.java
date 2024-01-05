public class Vehicles {
    private String name;
    private int currSpeed;
    private int currDirection;

    public void setCurrDirection(int currDirection) {
        this.currDirection = currDirection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrSpeed() {
        return currSpeed;
    }

    public void setCurrSpeed(int currSpeed) {
        this.currSpeed = currSpeed;
    }

    public int getCurrDirection() {
        return currDirection;
    }

    public Vehicles(String name) {
        this.name = name;
        this.currSpeed = 0;
        this.currDirection = 0;
    }
    public void steer(int direction)
    {
        this.currDirection+=direction;
        System.out.println("steer method is called-the direction is changed to: "+currDirection+"degrees");
    }
    public void move(int speed, int direction)
    {
        this.currSpeed=speed;
        this.currDirection= direction;
        System.out.println("move method called- the speed is changed to:"+ currSpeed+" and the direction is changed to: "+currDirection);
    }
    public void stop()
    {
        this.currSpeed=0;
        System.out.println("stop method called-vehicle is stopped");
    }
}
