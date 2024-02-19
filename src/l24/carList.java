package l24;
import java.util.Arrays;
import java.util.Scanner;
public class carList{

    boolean contExit;

    public int count = 0;

    Scanner scan = new Scanner(System.in);
    String[] cars = new String [5];

    public void carListGen (){

        while (true)
        {
            System.out.println("Введите название машины для списка, для завершения введите exit : ");
            String s = scan.nextLine();
            cars[count] = s;
            if (s.contains("exit"))
            {
                break;
            }

            count++;


            if (count >= cars.length)
            {
                cars = Arrays.copyOf(cars, cars.length + 1);
                cars[count] = s;

            }

            System.out.println(Arrays.toString(cars));






        }
    }





}
