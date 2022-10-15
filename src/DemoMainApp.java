public class DemoMainApp {
    public static void main(String[] args) {
//        System.out.println("Hello World!");


        Person susi; //Ein Objekt von Person für Susi
        susi = new Person();

        susi.uniqueID = 3290;
        susi.firstName = "Susi";
        susi.lastName = "Sorglos";
        susi.ageInYears = 29;
        susi.mailAdress = "susi.sorglos@test.com";

        Person max = new Person();
        max.uniqueID = 1234;
        max.firstName = "Max";
        max.lastName = "Mustermann";
        max.ageInYears = 32;
        max.mailAdress = "max.mustermann@test.com";

//        printPerson(max);
//
//        max.print();


        System.out.println(max.fullName());

    }



    public static void printPerson(Person max) {
        System.out.println("person.uniqueID = " + max.uniqueID);
        System.out.println("person.firstName = " + max.firstName);
        System.out.println("person.lastName = " + max.lastName);


    }
}
