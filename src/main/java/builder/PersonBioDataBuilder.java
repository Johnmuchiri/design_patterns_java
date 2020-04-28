package builder;

public class PersonBioDataBuilder extends PersonBuilder {

    public PersonBioDataBuilder(Person person){
        this.person = person;
    }

    public PersonBioDataBuilder name(String firstName, String lastName){
        this.person.firstName =firstName;
        this.person.lastName =lastName;
        return this;
    }
    public PersonBioDataBuilder identificationNo(String identificationNo, String identificationType){
        this.person.identificationNo =identificationNo;
        this.person.identificationType = identificationType;
        return this;
    }

    public PersonBioDataBuilder age(String age){
        this.person.age = age;
        return this;
    }
}
