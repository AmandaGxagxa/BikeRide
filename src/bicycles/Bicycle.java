package bicycles;

public interface Bicycle {
    int speed = 0;

    public void  accelerate ();
    public void brake();
    public void stop();
    public int currentSpeed();
    public int ride(Bicycle bicycle);
};











