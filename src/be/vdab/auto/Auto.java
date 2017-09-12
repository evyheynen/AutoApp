package be.vdab.auto;

public class Auto {
    private String merknaam;
    private String nummerplaat;
    private Motor motor=new Motor();


    public Auto(String merknaam, String nummerplaat) {
        this.merknaam = merknaam;
        this.nummerplaat = nummerplaat;
    }

    public Auto(String merknaam) {
        this.merknaam = merknaam;
    }

    public Auto(Auto copy){
        this(copy.merknaam,copy.nummerplaat);
        this.motor=copy.motor;
    }
    public void geefgas(){
       motor.verhoogdToerental(200);
    }
    public void geefgas(int waarde){
        motor.verhoogdToerental(waarde);
    }
    public void rem(){
        motor.setToerental(0);
    }
    public void toonToerental(){
        System.out.println(motor.getToerental());
    }
    @Override
    public String toString(){
        return merknaam +" met kenteken: "+nummerplaat;
    }

}
