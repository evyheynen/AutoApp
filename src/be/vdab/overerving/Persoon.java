package be.vdab.overerving;

public abstract class Persoon {
    private String naam;

    private String voornaam;
    private Adres adres= new Adres();

    public Persoon(String naam, String voornaam, String Straat, String nummer, int postcode, String gemeente ) {
        this(naam, voornaam, Adres(Straat, nummer, postcode, gemeente);


    }

    public Persoon(String naam, String voornaam, Adres adres) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.adres = adres;
    }

    private String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public static void voegvoornaamtoe(String...voornamen){
   StringBuilder builder= new StringBuilder(voornaam);
           for(String voornaam:voornamen){
               builder.append(" ").append(voornaam);
    }
    this.setVoornaam(builder.toString());
        }

    @Override
    public String toString(){
        return getVoornaam()+" "+ getNaam()+"\n"+getAdres();
    }

    }

