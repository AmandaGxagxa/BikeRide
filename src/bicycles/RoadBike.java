package bicycles;

public class RoadBike extends BicycleBase {

       // int speed = 0;

        @Override
        public void accelerate( ) {
            speed += 11;
        }

        @Override
        public void brake( ) {
            if(speed>4) {
                speed -= 4;
            }else{
                speed = 0;
            }
            System.out.println("your current speed is -: " + speed);

        }

//        @Override
//        public void stop( ) {
//            speed += 0;
//        }
//
//        @Override
//        public int currentSpeed( ) {
//            return speed;
//        }

    public static void main(String[] args) {
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.currentSpeed();
    }


}
