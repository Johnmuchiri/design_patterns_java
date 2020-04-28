package builder;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person){
        this.person = person;
    }
    public PersonAddressBuilder street(String street){
        this.person.streetAddress = street;
        return this;
    }
    public PersonAddressBuilder city(String city){

        this.person.city = city;
        return this;
    }
    public PersonAddressBuilder postalCode(String postalCode){
        this.person.postalCode = postalCode;
        return this;
    }
}
