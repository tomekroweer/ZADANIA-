import java.util.Scanner;

public class MyAuto {

    public static void main(String[] args) {

        int a = 7;
        String s = new String("hello");

        Auto BMW = new Auto();
        Auto MERC = new Auto();

        System.out.println(BMW.color);
        System.out.println(MERC.color);
        System.out.println(MERC.liczba_miejsc);
        System.out.println(MERC.velocity);

        BMW.set_all("Biały",5,12,220);

        MERC.set_all("Złoty",10,120, 2200);

        System.out.println("Podaj color BETY");

        Scanner scanner = new Scanner(System.in);

        String color = scanner.next();

        BMW.set_all(color, 5,12,220);

        System.out.println(BMW.color);
    }
}