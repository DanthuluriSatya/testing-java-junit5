package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerTest {
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("1231231234");
        assertAll("Properties Test",
                ()-> assertAll("Person Properties",
                       ()->assertEquals("Joe",owner.getFirstName(),"First Name didn't match"),
                       ()->assertEquals("Buck",owner.getLastName(),"Last Name didn't match")),
                ()-> assertAll("OwnerProperties",
                        ()->assertEquals("Key West",owner.getCity(),"City didn't match"),
                        ()->assertEquals("1231231234",owner.getTelephone(),"Phone didn't match"))
        );
       // assertThat(owner.getCity(),is("Key West"));
    }
}