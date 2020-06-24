package bicycles;

public enum BicycleType {
    Tandem(12,-5),
    RoadBike(11,-4),
    MountainBike(5,-3);

    private final int accelerationSpeed;
    private final int brakeSpeed;

 BicycleType(int accelerationSpeed, int brakeSpeed){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }
    public int getAccelerationSpeed(){
     return accelerationSpeed;
    }
    public int getBrakeSpeed( ) {
        return brakeSpeed;
    }

}
