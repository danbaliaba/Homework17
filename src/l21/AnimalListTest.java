package l21;

import l17.transport.Car;
import java.util.Arrays;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class AnimalListTest {

    @Test
    public void testNames()
    {
        Car carsInParkList = new Car ("Audi", "Grey", 240);

        Assertions.assertEquals(0, carsInParkList.countPublic );

        carsInParkList.arrayAdd("Audi");
        carsInParkList.arrayAdd("Porsche");

        Assertions.assertEquals(2, carsInParkList.countPublic );

        carsInParkList.arrayAdd("Mercedes");

    }


}
