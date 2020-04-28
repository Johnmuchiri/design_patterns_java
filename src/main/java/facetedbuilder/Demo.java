package facetedbuilder;

/**
 * String facetedbuilder example
 * */

public class Demo {


    public static void main(String []args){

        PersonBuilder pb = new PersonBuilder();

        Person person = pb
                .address()
                    .city("Nairobi")
                    .postalCode("00200")
                    .street("Kimathi Street")
                .bioData()
                    .name("John", "Doe")
                    .age("20")
                    .identificationNo("A25664243", "PASSPORT")
                .worksAt()
                    .employer("Kilimajaro Foods")
                    .positionAtWork("Senior Chef")
                .build();

        System.out.println(person.toString());


    }
}
