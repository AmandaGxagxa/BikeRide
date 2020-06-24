package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBicycle {
    @Test
    public void shouldReturnAccelerateForMountainBike() {
        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(15,  bicycle.currentSpeed());

    }
    @Test
    public void shouldAccelerateAndBrakeCorrectForMountainBike() {

        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(4, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectlyForMountainBike() {

        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(1, bicycle.currentSpeed());

    }
    @Test
    public void shouldBeAbleToStopForMountainBike() {

        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }
    @Test
public void shouldReturnAccelerateForRoadBike(){
    Bicycle bicycle = new RoadBike();
    bicycle.accelerate();
    bicycle.accelerate();
    assertEquals(22, bicycle.currentSpeed());
    System.out.println(bicycle.currentSpeed());
}
    @Test
    public void shouldReturnTheBrakesSpeedForRoadBike(){
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());
        System.out.println(bicycle.currentSpeed());
    }
    @Test
    public void shouldReturnStopForRoadBike(){
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();

        bicycle.brake();
        bicycle.brake();
        bicycle.stop();
        //bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
        System.out.println(bicycle.currentSpeed());
    }
    @Test
    public void  itShouldAccelerateTandemCorrectly(){
        Bicycle bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(12, bicycle.currentSpeed());
        System.out.println(bicycle.currentSpeed());
    }
    @Test
    public void  itShouldAccelerateAndBrakeWithTandemCorrectly(){
        Bicycle bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());
        System.out.println(bicycle.currentSpeed());
    }
    @Test
    public void  itShouldAccelerateBikeRideOne(){
        Bicycle bicycle = new MountainBike();
        BikeRideOne bikeRideOne = new bicycles.BikeRideOne(bicycle);
        bikeRideOne.ride(bicycle);
//        bicycle.accelerate();
//        bicycle.brake();
        assertEquals(14, bicycle.currentSpeed());
        System.out.println(bicycle.currentSpeed());
    }
    @Test
    public void  itShouldAccelerateBikeRideTwo(){
        Bicycle bicycle = new MountainBike();
        BikeRideTwo bikeRideTwo = new bicycles.BikeRideTwo(bicycle);
        bikeRideTwo.ride(bicycle);
//        bicycle.accelerate();
//        bicycle.brake();
        assertEquals(9, bicycle.currentSpeed());
        System.out.println(bicycle.currentSpeed());
    }
    @Test
    public void  itShouldAccelerateBikeRideThree(){
        Bicycle bicycle = new MountainBike();
        BikeRideThree bikeRideThree = new bicycles.BikeRideThree(bicycle);
        bikeRideThree.ride(bicycle);
        assertEquals(9, bicycle.currentSpeed());
        System.out.println(bicycle.currentSpeed());
    }
    @Test
    public void itshouldTestBicycleSpecificationTandem(){
        BicycleSpecification bicycle = new BicycleSpecification(BicycleType.Tandem);
        bicycle.getBicycleType();
        assertEquals(BicycleType.Tandem, bicycle.getBicycleType());
    }
    @Test
    public void itshouldTestBicycleSpecificationForMountainBike(){
        BicycleSpecification bicycle = new BicycleSpecification(BicycleType.MountainBike);
        bicycle.getBicycleType();
        assertEquals(BicycleType.MountainBike, bicycle.getBicycleType());
    }
    @Test
    public void itshouldTestBicycleSpecificationForRoadBike(){
        BicycleSpecification bicycle = new BicycleSpecification(BicycleType.RoadBike);
        bicycle.getBicycleType();
        assertEquals(BicycleType.RoadBike, bicycle.getBicycleType());
    }
    @Test
    public void itshouldTestBikeSpecSpeedForMountainBike(){
        BicycleSpecification bikeSpecForMb = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle mb = new BicycleFromSpec(bikeSpecForMb);

        BikeRideOne Mbike = new BikeRideOne(mb);
        Mbike.ride(mb);
        assertEquals(2, mb.currentSpeed());

    }
    @Test
    public void itshouldTestBikeSpecSpeedForTandem(){
        BicycleSpecification bikeSpecForMb = new BicycleSpecification(BicycleType.Tandem);
        Bicycle mb = new BicycleFromSpec(bikeSpecForMb);

        BikeRideOne Mbike = new BikeRideOne(mb);
        Mbike.ride(mb);
        assertEquals(7, mb.currentSpeed());
    }
    @Test
    public void itshouldTestBikeSpecSpeedForRoadBike(){
        BicycleSpecification bikeSpecForMb = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle mb = new BicycleFromSpec(bikeSpecForMb);

        BikeRideOne Mbike = new BikeRideOne(mb);
        Mbike.ride(mb);
        assertEquals(7, mb.currentSpeed());
    }
}

