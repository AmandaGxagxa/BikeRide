package bicycles;

public class BikeRide {
    private int speed;
    private final Bicycle bicycle;

    BikeRide(Bicycle bicycle)
    {
    this.bicycle  = bicycle;
    }
    public int currentSpeed(){
        return speed;
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
public static void main(String [] args){
    RoadBike bicycle = new RoadBike();
    BikeRide bikeRide = new BikeRide(bicycle);
    bikeRide.ride();

    System.out.println(bikeRide.currentSpeed());
}

}
