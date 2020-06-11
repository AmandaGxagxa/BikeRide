package bicycles;

public class BikeRideTwo implements BikeRide {
    private int speed;
    private Bicycle bicycle;

    BikeRideTwo(Bicycle bicycle){
        this.bicycle=bicycle;
    }

    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
//        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
    private int currentSpeed( ) {
        return speed;
    }
    public static void main(String [] args){
        Bicycle bicycle = new MountainBike();
        BikeRideTwo bikeRideTwo = new bicycles.BikeRideTwo(bicycle);
        bikeRideTwo.ride(bicycle);

        System.out.println(bikeRideTwo.currentSpeed());
    }




}
