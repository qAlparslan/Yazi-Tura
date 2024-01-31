import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Yazımı turamı ?");
        String cevap = scanner.nextLine();

        System.out.println();

        boolean bool = random.nextBoolean();

        if (bool) {
            System.out.println("Yazı");
            if (cevap.equalsIgnoreCase("yazi")) {
                System.out.println("Kazandın");
            } else {
                System.out.println("Kaybettin");
            }
        } else {
            System.out.println("Tura");
            if (cevap.equalsIgnoreCase("tura")) {
                System.out.println("Kazandın");
            } else {
                System.out.println("Kaybettin");
            }
        }
    }
}
