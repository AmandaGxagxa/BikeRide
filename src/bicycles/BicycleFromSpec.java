package bicycles;

public class BicycleFromSpec extends BicycleBase {
    private int brakeSpeed;
   private int accelerationSpeed;
   private BicycleType bicycleType;

    public BicycleFromSpec(BicycleSpecification roadBikeSpec) {
        this.accelerationSpeed=roadBikeSpec.getAccelerationSpeed();
        this.brakeSpeed = roadBikeSpec.getBrakeSpeed();
        this.bicycleType= bicycleType
        
    }

    @Override
    public void accelerate( ) {
        speedChange(5);
    }

    @Override
    public void brake( ) {
        speedChange(-4);

    }

    @Override
    public int ride(Bicycle bicycle) {
        return Bicycle.speed;
    }
}
