package bicycles;

public class MountainBike extends BicycleBase{

        //int speed = 0;
        public void accelerate( ) {
            speedChange(5);
        }

        public void brake( ) {
          speedChange(-3);
            }
            //System.out.println("your current speed is : " + speed);
        };



//    public static void main(String[] args){
//
//        Bicycle bicycle = new MountainBike();
//        bicycle.brake();
//
//    }

//}
