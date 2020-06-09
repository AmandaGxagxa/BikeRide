package bicycles;

public abstract class BicycleBase implements Bicycle {
    private int speed = 0;

    protected void speedChange(int changeSpeed){
           speed+=changeSpeed;
    }

    public int currentSpeed(){
        return speed;
    }
    public void stop(){
        speed = 0;
    };
}
