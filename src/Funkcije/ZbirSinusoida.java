package Funkcije;

import java.util.List;

public class ZbirSinusoida extends Funkcija {
    private List<Clan> clan;
    Sinusoida sinusoida;

    public ZbirSinusoida(double x, List<Clan> clan) {
        super(x);
        this.clan = clan;
    }

    @Override
    public double vrednost() {

        double vrednostSinusoida = 0.0;
        for (int i = 0; i < clan.size(); i++) {
            sinusoida = new Sinusoida(super.getX(), this.clan.get(i));
            vrednostSinusoida += sinusoida.vrednost();
        }
        return vrednostSinusoida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < clan.size(); i++) {
            Clan trenutniClan = clan.get(i);

            long a = Math.round(trenutniClan.getA());
            long b = Math.round(trenutniClan.getB());
            long x = Math.round(super.getX());

            if (i == 0) {
                sb.append(String.format("%+d*sin(%d*%d*PI)", a, b, x));
            } else {
                sb.append(String.format("%+d*sin(%d*%d*PI)", a, b, x));
            }
        }
        return sb.toString();
    }

}
