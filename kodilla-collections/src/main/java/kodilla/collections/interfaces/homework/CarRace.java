package kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args){
        Ford ford = new Ford(2);
        System.out.println(ford.decreaseSpeed());
        System.out.println(ford.increaseSpeed());
        System.out.println(ford.getSpeed());

        Opel opel = new Opel(4);
        System.out.println(opel.decreaseSpeed());
        System.out.println(opel.increaseSpeed());
        System.out.println(opel.getSpeed());

        doRace doRace = new doRace(100,200,150 );
    }
}
