package kodilla.collections.interfaces.homework;

public class doRace implements Car {
    private final double increaseSpeed;
    private final double decreaseSpeed;
    private final double getSpeed;

    public doRace (double increaseSpeed, double decreaseSpeed,double getSpeed){
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
        this.getSpeed = getSpeed;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public double increaseSpeed() {
        return decreaseSpeed * increaseSpeed/2;

    }

    @Override
    public double decreaseSpeed() {
        return increaseSpeed + decreaseSpeed+ getSpeed;

    }
}
