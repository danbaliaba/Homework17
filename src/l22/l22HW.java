package l22;


import l17.transport.Car;
import l17.transport.Bus;
import l17.transport.Bike;
import l17.people.Man;
import l17.people.Woman;
import l17.animal.Cat;
import l17.animal.Cow;
import l17.animal.Dog;

public class l22HW {
    public static void main(String[] args) {
        Dog dog = new Dog ("alive", 4, 2018, "Sharik");
        Cow cow = new Cow("alive" , 4, "Murka", 2015);
        Cat cat = new Cat("dead", 4, 1999, "Kot");
        Woman woman = new Woman(2,2,"alive", 45, "Masha");
        Man man = new Man(2,2, "alive", 80, "Alex");
        Bike bike = new Bike("bad", "not alive", 26, "green");
        Bus bus = new Bus("good", "not alive ", 100, "yellow");
        Car carList = new Car("good", "not alive", "Range Rover", "Black", 200) ;

        System.out.println(carList);
        System.out.println(bus);
        System.out.println(bike);
        System.out.println(man);
        System.out.println(woman);
        System.out.println(cat);
        System.out.println(cow);
        System.out.println(dog);
    }


}
