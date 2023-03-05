package Chap04.sector03;

public class HankkokTire extends Tire{
    public HankkokTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + "hankookTire 수명:"+ (maxRotation-accumulatedRotation)+"회");
            return true;
        }else {
            System.out.println("***"+ location + " hankookTire 펑크 ***");
            return false;
        }
    }
}
