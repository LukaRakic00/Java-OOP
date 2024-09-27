import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite vrednost izmedju 0 i 2: ");
        double x = sc.nextDouble();

        if (x < 0 || x > 2) {
            System.out.println("Nije dobra vrednost x!!");
            return;
        }

        System.out.println("Unesite funkciju (s-sinusoida, z-zbir):");
        char c = sc.next().charAt(0);

        switch (c) {
            case 's': {

                System.out.println("Unesite a:");
                int a = sc.nextInt();
                System.out.println("Unesite b:");
                int b = sc.nextInt();

                TestFunkcije tf = new TestFunkcije(a, b);

                Sinusoida s = new Sinusoida(x, tf);
                System.out.println("Funkcija: \n" + s.toString());

                System.out.printf("Vrednost: %.2f", s.vrednost());
            }
            break;

            case 'z': {
                System.out.println("Unesite broj clanova zbira: ");
                int brojClanova = sc.nextInt();

                List<Clan> clan = new ArrayList<>(brojClanova);

                int a, b;
                int brojacZaIspis = 1;
                for(int i = 0; i < brojClanova; i++) {

                    System.out.println("Unesite a za " + brojacZaIspis + ". clan:");
                    a = sc.nextInt();
                    System.out.println("Unesite b za " + brojacZaIspis +". clan:");
                    b = sc.nextInt();

                    clan.add(new Clan(a, b));
                    brojacZaIspis++;
                }

                ZbirSinusoida zs = new ZbirSinusoida(x, clan);
                System.out.println("Funkcija: \n" + zs.toString());

                System.out.printf("Vrednost: %.2f.", zs.vrednost());

            } break;

            default:
                System.out.println("Niste dobro uneli vrednost c za funkciju");
                break;
        }


    }
}