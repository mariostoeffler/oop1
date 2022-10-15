public class Bank {
    public static void main(String[] args) {
        Gehaltskonto peter1 = new Gehaltskonto("PeterZwegat1", "29302342039429", "600000");
        Gehaltskonto peter12 = new Gehaltskonto("PeterZwegat2", "2930234203942921", "6000002");
        Gehaltskonto peter123 = new Gehaltskonto("PeterZwegat3", "2930234203942913", "6000003");


        peter12.aufbuchen(234223);
        peter123.aufbuchen(23421);

        peter1.aufbuchen(23423);
        peter12.getKontostand();
        peter1.getKontostand();
        peter123.getKontostand();


        Gehaltskonto[] newGehaltskonto = {peter1, peter12, peter123};


        for (int i = 0; i < newGehaltskonto.length; i++) {
            System.out.println("Kontostand von  " + newGehaltskonto[i].getInhaber() +" = "  +newGehaltskonto[i].toString());

        }
    }
}
