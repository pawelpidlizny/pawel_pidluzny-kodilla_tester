package kodilla.collections.arrays.homework;


import kodilla.collections.interfaces.homework.Car;
import kodilla.collections.interfaces.homework.Ford;
import kodilla.collections.interfaces.homework.Opel;


import java.util.Random;

public class CarsApplication {


    public static void main(String[] args) {

        Random random = new Random();
        Car[] car = new Car[random.nextInt(14) + 1];
        for (int index = 0; index < car.length; index++){
            car[index] = drawCar();
        }
        for (Car cars : car){
            CarUtils.describeCar(cars);
        }
    }
    public static Car drawCar() {
        Random random = new Random();
        int drawModelCar =  random.nextInt(2);


        if (drawModelCar == 0 ) {
            return new Ford(random.nextInt(15));

        }else{
            return new Opel(random.nextInt(15));

        }
    }
}
