package bicycles;
import bicycles.*;
import java.util.ArrayList;
import java.util.List;

public class FunRide {
    public int bikeMax;
    public int bikeCount;
    public FunRide(int bikeMax){
    this.bikeMax += bikeMax;
    }
    private List<Bicycle> bicycleList = new ArrayList<Bicycle>();

    public void acceptBike(Bicycle bicycle){
      if(bicycleList.size() < bikeMax && !bicycleList.contains(bicycle)){
          bicycle.add(bicycle);
      }

    }
    public int getBikeCount(int bikeType){

        return bicycleList.size();
    }

    public static void main(String[] args) {
        FunRide funRide = new FunRide(3);

    }
}
