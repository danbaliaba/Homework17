package l27;

public interface GrassEating {

    void setRun();

    void lookAround();

    default void setDie(){
        System.out.println("Животное было съедено");
    }


}
