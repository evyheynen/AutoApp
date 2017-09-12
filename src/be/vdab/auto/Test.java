package be.vdab.auto;

public class Test {

    public static void main(String[] args) {
        Auto auto= new Auto("VW GOLF", "1-AWX-186");
        System.out.println("test van:" + auto);

        for (int i = 0; i <30 ; i++) {
            auto.geefgas();
            auto.toonToerental();
        }

        System.out.println("REMMEN");
        auto.rem();

        for(int i=0;i<3;i++){
            auto.geefgas(3000);
            auto.toonToerental();
        }
        Auto kopie=new Auto(auto);
        System.out.println("\nkopie: "+auto);
    }
}
