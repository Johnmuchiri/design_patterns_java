package facetedbuilder;

public class PersonBuilder {


    protected Person person = new Person();

    public  PersonAddressBuilder address(){
        return new PersonAddressBuilder(person);
    }

    public PersonBioDataBuilder bioData(){
        return new PersonBioDataBuilder(person);
    }

    public PersonWorkBuilder worksAt(){
        return new PersonWorkBuilder(person);
    }

    public Person build(){
        return  person;
    }
}
