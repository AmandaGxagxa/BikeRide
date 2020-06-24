package bicycles;

public class RoadBike extends BicycleBase {

        public void accelerate() {
            speedChange(11);
        }


        public void brake() {
            speedChange(-4);

        }


//    public static void main(String[] args) {
//        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
//        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
//        System.out.println(Bicycle.speed);
//    }


}
