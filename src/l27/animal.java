package l27;

public interface animal {
     void setWalk();

     default void goEat(){
         System.out.println("Животное идёт есть");
     }


}
