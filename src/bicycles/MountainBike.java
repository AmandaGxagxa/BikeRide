package bicycles;

public class MountainBike extends BicycleBase{

        //int speed = 0;
        public void accelerate( ) {
            speed += 5;
        }

        public void brake( ) {
            if(speed>3) {
                speed -= 3;
            }else{
                speed = 0;
            }
            System.out.println("your current speed is : " + speed);
        }

        public void stop( ) {
            speed = 0;
        }


        public int currentSpeed( ) {
            return speed;
        }

    public static void main(String[] args){

        Bicycle bicycle = new MountainBike();
        bicycle.brake();

    }

}
