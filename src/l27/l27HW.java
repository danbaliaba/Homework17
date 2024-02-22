package l27;

public class l27HW{
    public static void main(String[] args) {

        cow cow = new cow();
        wolf wolf = new wolf();

        System.out.println(" ");

        cow.setWalk();
        wolf.setWalk();

         System.out.println(" ");

         cow.lookAround();
         wolf.hide();

         System.out.println(" ");

         cow.goEat();
         wolf.setWait();

         System.out.println(" ");

         wolf.setHunt();
         cow.setRun();

         System.out.println(" ");

         cow.setDie();
         wolf.goEat();

    }

}
