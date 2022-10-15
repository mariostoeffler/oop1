import org.w3c.dom.ls.LSOutput;

public class Person {
    // Unsere Klassen haben KEINE main-Methode

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public int uniqueID;
    public String firstName;
    public String lastName;
    public int ageInYears;
    public String mailAdress;

    //Methoden innerhalb der Klasse sind MEIST NICHT static
    public void print() {
        System.out.println("uniqueID = " + uniqueID);
        System.out.println("firstName = " + firstName);
    }

        public String fullName() {
            return firstName + " "  + lastName;
        }



}
