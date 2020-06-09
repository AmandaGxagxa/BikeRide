package bicycles;

public class Tandem extends BicycleBase {
    @Override
    public void accelerate( ) {
        speedChange(12);
    }

    @Override
    public void brake( ) {
speedChange(-5);
    }
}
