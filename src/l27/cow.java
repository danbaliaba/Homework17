package l27;

public class cow implements animal, GrassEating {

    @Override
    public void setWalk(){
        System.out.println("Корова прогуливается по лугу");

    }

    @Override
    public void setRun(){
        System.out.println("Корова бежит от волка");

    }

    @Override
    public void lookAround(){

        System.out.println("Корова насторожено осматривается");

    }
    @Override
    public void setDie(){

        System.out.println("Корова мёртвая лежит на земле");

    }



}
