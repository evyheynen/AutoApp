package be.vdab.overerving;

public class Manager extends Werknemer {
    private int bonus;
    private static int count=0;

    public Manager(String naam, String voornaam, Adres adres, String functie, double salaris, int bonus) {
        super(naam, voornaam, adres, functie, salaris);
        this.bonus = bonus;
    }

    public Manager(String naam, String voornaam, Adres adres, String functie, double salaris) {
        super(naam, voornaam, adres, functie, salaris);
        bonus = 50;
        count++;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getSalaris(){
        return super.getSalaris=+getBonus();
    }

    public double getProcAandeelManagers(){
        return double procent=Manager.tellermanager/Werknemer.teller;
    }


}
