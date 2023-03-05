package Chap04.sector03;

public class KumhoTire extends Tire{
    public KumhoTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + "kumhoTire 수명:"+ (maxRotation-accumulatedRotation)+"회");
            return true;
        }else {
            System.out.println("***"+ location + " kumhoTire 펑크 ***");
            return false;
        }
    }
}
