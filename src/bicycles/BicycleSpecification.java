package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    public BicycleSpecification(BicycleType bicycleType) {
        this.accelerationSpeed = bicycleType.getAccelerationSpeed();
        this.brakeSpeed = bicycleType.getBrakeSpeed();
        this.bicycleType = bicycleType;
    }


    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    public int getBrakeSpeed(){
        return brakeSpeed;
    }
    public BicycleType getBicycleType(){
        return bicycleType;
    }

    public static void main(String[] args) {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne br = new BikeRideOne(bicycle);
        bicycle.currentSpeed();
        br.ride(bicycle);
       System.out.println(bicycle.currentSpeed());

        System.out.println(bicycle.currentSpeed());
        BicycleSpecification bikeSpec = new BicycleSpecification(BicycleType.Tandem);
        Bicycle bic = new BicycleFromSpec(bikeSpec);
        BikeRideOne tandem = new BikeRideOne(bic);
        bic.currentSpeed();
        tandem.ride(bic);
        System.out.println(bic.currentSpeed());
        System.out.println(bicycle.currentSpeed());

        BicycleSpecification bikeSpecForMb = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle mb = new BicycleFromSpec(bikeSpecForMb);
        BikeRideOne Mbike = new BikeRideOne(mb);
        mb.currentSpeed();
        Mbike.ride(mb);
        System.out.println(mb.currentSpeed());
    }

}
