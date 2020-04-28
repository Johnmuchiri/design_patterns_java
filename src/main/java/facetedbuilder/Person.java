package facetedbuilder;

public class Person {

//    bio data
    public String firstName, lastName, identificationNo,identificationType,  age;

//    address

    public String streetAddress, postalCode, city;

//    work details

    public String companyName, position;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identificationNo='" + identificationNo + '\'' +
                ", identificationType='" + identificationType + '\'' +
                ", age='" + age + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
