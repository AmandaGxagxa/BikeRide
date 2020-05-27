package bicycles;

public abstract class BicycleBase implements Bicycle {
protected int speed = 0;
    protected int changeSpeed(){
        return   speed+=speed;
    }
    public int currentSpeed(){
        return speed;
    }
    public void stop(){
        speed = 0;
    };
}
