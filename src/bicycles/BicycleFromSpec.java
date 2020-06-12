package bicycles;

public class BicycleFromSpec extends BicycleBase {
    private int brakeSpeed;
   private int accelerationSpeed;
   //private BicycleType bicycleType;

    public BicycleFromSpec(BicycleSpecification roadBikeSpec) {
        this.accelerationSpeed=roadBikeSpec.getAccelerationSpeed();
        this.brakeSpeed = roadBikeSpec.getBrakeSpeed();
       // this.bicycleType= bicycleType
        
    }

    @Override
    public void accelerate( ) {
        speedChange(accelerationSpeed);
    }

    @Override
    public void brake( ) {
        speedChange(brakeSpeed);

    }

    @Override
    public int ride(Bicycle bicycle) {
        return Bicycle.speed;
    }
    public static void main(String[] args) {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        System.out.println(bicycle.currentSpeed());
//        Bicycle bicycle = new RoadBike();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.currentSpeed();
    }

}
