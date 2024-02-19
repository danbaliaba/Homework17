package l24;

import l24.carList;

public class l24HW {
    public static void main(String[] args) {

        car HWcar = new car("good", "not alive", "new model", "red", 255);
        car HWcar2 = new car("bad", "not alive", "old model", "black", 140);

        System.out.println(HWcar);
        System.out.println(HWcar2);

        carList c = new carList();
        c.carListGen();



    }
}