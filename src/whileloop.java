import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double ratting = 0;
        double avenge = 0;
        int counting = 0;

        while (ratting != -1){
            System.out.println("Tell me the BR you thonk is fair, -1 to finish the voting");
            ratting = reading.nextDouble();
            if (ratting != -1){
                avenge += ratting;
                counting++;
            }

        }
        System.out.println("avrenge of BR" + avenge/counting);
    }
}

