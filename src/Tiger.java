import java.util.Scanner;

public class Tiger {
    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);

        System.out.println("insert the tank you are in");
        String tank = player.nextLine();
        System.out.println("what is the BR of the tank");
        var battleRating = player.nextLine();
        System.out.println(battleRating);
        var ammo = player.nextLine();
        System.out.println(ammo);
    }
}
