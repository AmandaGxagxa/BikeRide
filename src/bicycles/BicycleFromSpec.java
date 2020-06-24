package bicycles;

public class BicycleFromSpec extends BicycleBase {

    private BicycleSpecification bicycle;

    public BicycleFromSpec(BicycleSpecification bicycle) {
        this.bicycle=bicycle;
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate( ) {
        speedChange(this.bicycle.getAccelerationSpeed());
    }

    @Override
    public void brake( ) {
        speedChange(this.bicycle.getBrakeSpeed());
    };

}
