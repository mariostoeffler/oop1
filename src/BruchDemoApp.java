public class BruchDemoApp {

    public static void main(String[] args) {
        Bruch ersterBruch = new Bruch(1, 4);
        Bruch zweiterBruch = new Bruch(2, 43);
        Bruch dritterBruch = new Bruch(32, 46);

        Bruch ergebnis = ersterBruch.multiplicate(zweiterBruch);
        ergebnis.print();

        Bruch sieben = ersterBruch.multiplicate(zweiterBruch, dritterBruch);
        sieben.print();




        //System.out.println(ersterBruch.toDecimal());


    }
}
