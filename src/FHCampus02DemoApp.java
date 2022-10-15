public class FHCampus02DemoApp {

    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setFirstName("Susi");
        student1.setLastName("Sorglos");
        student1.setNumber(1);
        student1.setUserName("ssorglos");


        Student student2 = new Student();
        student2.setUserName("neu");
     student2.initialize(3, "Peter", "Zwegat");
        System.out.println(student2.toString());


        System.out.println("student1.toString() = " + student1.toString());
    }
}
