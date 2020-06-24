package bicycles;

public class BikeRideOne implements BikeRide {
        private int speed;
        private Bicycle bicycle;

        BikeRideOne(Bicycle bicycle){
        this.bicycle=bicycle;
        }
        public void ride(Bicycle bicycle) {
            this.bicycle.accelerate();
//            this.bicycle.accelerate();
//            this.bicycle.accelerate();
//            this.bicycle.brake();
            this.bicycle.brake();
//            this.bicycle.accelerate();
        }
    public int currentSpeed( ) {
        return speed;
    }

        public static void main(String [] args){
            Bicycle bicycle = new MountainBike();
            BikeRideOne bikeRideOne = new bicycles.BikeRideOne(bicycle);
            bikeRideOne.ride(bicycle);
            bikeRideOne.ride(bicycle);

           System.out.println(bikeRideOne.currentSpeed());
        }




}
