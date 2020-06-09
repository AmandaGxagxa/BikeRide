package bicycles;

public class RoadBike extends BicycleBase {

        public void accelerate() {
            speedChange(11);
        }


        public void brake() {
            speedChange(-4);

        }


    public static void main(String[] args) {
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.currentSpeed();
    }


}
