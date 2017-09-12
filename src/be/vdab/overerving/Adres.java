package be.vdab.overerving;

public class Adres {
    private String straat, nummer,gemeente;
    private int postcode;


    public Adres() {
    }

    public Adres(String straat, String nummer, int postcode, String gemeente) {
        this.straat = straat;
        this.nummer = nummer;
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    public static String getStraat() {
        return straat;
    }

    public static void setStraat(String straat) {
        Adres.straat = straat;
    }

    public static String getNummer() {
        return nummer;
    }

    public static void setNummer(String nummer) {
        Adres.nummer = nummer;
    }

    public static int getPostcode() {
        return postcode;
    }

    public static void setPostcode(int postcode) {
        Adres.postcode = postcode;
    }

    public static String getGemeente() {
        return gemeente;
    }

    public static void setGemeente(String gemeente) {
        Adres.gemeente = gemeente;
    }
    @Override
    public String toString(){
        return getStraat()+ getNummer() +"\n"+getPostcode()+getGemeente();
    }

}
