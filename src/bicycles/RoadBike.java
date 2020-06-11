package bicycles;

public class RoadBike extends BicycleBase {

        public void accelerate() {
            speedChange(11);
        }


        public void brake() {
            speedChange(-4);

        }

    @Override
    public int ride(Bicycle bicycle) {
        return Bicycle.speed;
    }


    public static void main(String[] args) {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
//        Bicycle bicycle = new RoadBike();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.currentSpeed();
    }


}
