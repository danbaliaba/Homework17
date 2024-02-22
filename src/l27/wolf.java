package l27;

public class wolf implements animal,MeatEating{

    @Override

    public void setWalk(){
        System.out.println("Волк прогуливаеься по лугу");

    }

    @Override

    public void setHunt(){
        System.out.println("Волк пытается убить корову");
    }

    @Override
    public void hide(){
        System.out.println("Волк приатился в кустах");
    }

    @Override
    public void setWait(){
        System.out.println("Волк ждёт, когда корова окажеься близко к кустам");
    }



}
