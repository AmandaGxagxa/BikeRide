package bicycles;

public class BikeRideThree implements BikeRide {
    private int speed;
    private Bicycle bicycle;

    BikeRideThree(Bicycle bicycle){
        this.bicycle=bicycle;
    }

    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
//        this.bicycle.accelerate();
    }
    public static void main(String [] args){
        Bicycle bicycle = new MountainBike();
        BikeRideThree bikeRideThree = new bicycles.BikeRideThree(bicycle);
        bikeRideThree.ride(bicycle);

        System.out.println(bicycle.currentSpeed());
    }

}
