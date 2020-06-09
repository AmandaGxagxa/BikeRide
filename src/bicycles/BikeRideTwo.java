package bicycles;

public class BikeRideTwo implements BikeRide {
    private int speed;
    private Bicycle bicycle;

    public int currentSpeed(){
        return speed;
    }

    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
    public static void main(String [] args){
        Bicycle bicycle = new MountainBike();
        bicycles.BikeRideTwo bikeRideTwo = new bicycles.BikeRideTwo();
        bikeRideTwo.ride(bicycle);

        System.out.println(bicycle.currentSpeed());
    }



}
