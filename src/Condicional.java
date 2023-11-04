public class Condicional {
    public static void main(String[] args) {
        int yearOfLauch = 1942;//declaracao de integro
        boolean unloacked = true; // desboqueado ou nao
        double battleRatting = 6.4; // nivel de tanque

        String variant = "H";

        if (yearOfLauch <= 1945){
            System.out.println("German Wehrmacht WW2 Tank");
        }
        else {
            System.out.println("American or USSR land leased Tank");
        }
        if (unloacked == true || variant.equals("H1")){
            System.out.println("Tank is unlocked");
        }else {
            System.out.println("tank is locked");
        }
    }
}
