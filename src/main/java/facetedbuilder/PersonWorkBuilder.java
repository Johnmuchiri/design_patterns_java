package facetedbuilder;

public class PersonWorkBuilder extends PersonBuilder {

    public  PersonWorkBuilder(Person person){
        this.person = person;
    }

    public PersonWorkBuilder employer(String employer){
        this.person.companyName =employer;

        return this;
    }
    public PersonWorkBuilder positionAtWork(String position){
        this.person.position =position;
        return this;
    }
}
