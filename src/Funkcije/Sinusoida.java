package Funkcije;

public class Sinusoida extends Funkcija {
    private Clan clan;
    private double vrednost;

    public Sinusoida(double x, Clan clan) {
        super(x);
        this.clan = clan;
        this.vrednost = clan.getA()  * Math.sin(clan.getB() * super.getX() * Math.PI);
    }

    @Override
    public String toString() {
        return String.format("%d*sin(%d*%.2f*PI)",
                clan.getA(),
                clan.getB(),
                super.getX()
        );
    }

    @Override
    public double vrednost() {
        return vrednost;
    }
}
