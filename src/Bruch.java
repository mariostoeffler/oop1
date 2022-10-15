public class Bruch {
    private int nenner;
    private int zaehler;
    private double bruch;

    public Bruch(int nenner, int zaehler) {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public String toDecimal() {
        this.bruch = this.nenner / (this.zaehler * 1.0);
        return "Bruch = " + this.bruch + "\n" + this.nenner + "/" + this.zaehler;
    }

    public void print() {
        System.out.println(this.nenner + "/" + this.zaehler);
    }

    public Bruch multiplicate(Bruch b2) {
        int newNenner = nenner * b2.nenner;
        int newZaehler = zaehler * b2.zaehler;
        Bruch result = new Bruch(newNenner, newZaehler);
        return result;
    }

    public Bruch multiplicate(Bruch b2, Bruch b3) {
        int newNenner = nenner * b2.nenner * b3.nenner;
        int newZaehler = zaehler * b2.zaehler * b3.zaehler;
        Bruch neuerBruch = new Bruch(newNenner, newZaehler);
        return neuerBruch;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getBruch() {
        return (int) bruch;
    }

    public void setBruch(int bruch) {
        this.bruch = bruch;
    }
}
