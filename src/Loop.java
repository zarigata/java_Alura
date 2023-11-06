import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double ratting;
        double avenge = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Tell me the BR you thonk is fair");
            ratting = reading.nextDouble();
            avenge += ratting;
        }
        System.out.println("avrenge of BR" + avenge/3);
    }
}
