package l27;

public interface MeatEating {

    void setHunt();

    void hide();

    default void setWait(){
        System.out.println("Хищник чего - то ждёт");
    }

}
