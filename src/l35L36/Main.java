package l35L36;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BobrList bobrList = new BobrList();
        bobrList.addBobr("Ivan", 7, 10);
        bobrList.addBobr("Alex", 5, 13);
        bobrList.addBobr("Ivan", 7, 7);
        bobrList.addBobr("Petya", 12, 9);
        bobrList.addBobr("Igor", 3, 2);

        bobrList.showList();
        bobrList.sortBobr();

       System.out.println(BobrList.setHashMap());
       BobrList.setHashSet();

        BobrList.Iterator();




    }
}
