import l17.transport.Car;
import l17.transport.Bus;
import l17.transport.Bike;
import l17.people.Man;
import l17.people.Woman;
import l17.animal.Cat;
import l17.animal.Cow;
import l17.animal.Dog;

import javax.sound.midi.SysexMessage;

public class L17Main {
    public static void main(String[] args) {
        Dog dog = new Dog (2013, "Alpha");
        Cow cow = new Cow(2005, " Murka");
        Cat cat = new Cat(2000, "Vasya");
        Woman woman = new Woman(160,"Christina");
        Man man = new Man(176, "Daniil");
        Bike bike = new Bike(20, "Green");
        Bus bus = new Bus(18,"Yellow");
        Car ferr = new Car("Ferrari", "Red", 250);
        System.out.println(ferr);
        System.out.println(bus);
        System.out.println(bike);
        System.out.println(man);
        System.out.println(woman);
        System.out.println(cat);
        System.out.println(cow);
        System.out.println(dog);
    }
}
