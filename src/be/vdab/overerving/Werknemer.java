package be.vdab.overerving;

public class Werknemer extends Persoon{
    private String functie;
    private double salaris;

    private final double MIN_SALARIS=1000;
    private static int teller=0;

    public Werknemer(String naam, String voornaam, Adres adres) {
       this(naam, voornaam, adres,"algemeen bediende",  1800);


    }

    public Werknemer(String naam, String voornaam, Adres adres,String functie, double salaris) {
        super(naam, voornaam, adres);
        this.functie = functie;
        this.salaris=1800;
        teller++;
}

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris>=MIN_SALARIS?salaris:MIN_SALARIS;
    }

    public double getMIN_SALARIS() {
        return MIN_SALARIS;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+getFunctie()+"\n"+"Salaris:"+getSalaris();
    }

}