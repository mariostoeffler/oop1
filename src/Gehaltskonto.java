public class Gehaltskonto {

    private String inhaber;

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }



    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    private String iban;
    private String bic;
    private double kontostand;

    public Gehaltskonto(String inhaber, String iban, String bic) {
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;
        this.kontostand = 0.0;
    }

    public void aufbuchen(double kontostand) {
        this.kontostand = kontostand + this.kontostand;
    }

    public void abbuchen(double kontostand) {
        if (this.kontostand - kontostand > 0) {
            this.kontostand = this.kontostand - kontostand;

        }
        System.out.println("Der Wert darf nicht unter 0 betragen!");
    }

    public void getKontostand() {
        System.out.println("this.kontostand = " + this.kontostand);
    }

    @Override
    public String toString() {
        return "Kontostand = " + kontostand;
    }
}
