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
}
