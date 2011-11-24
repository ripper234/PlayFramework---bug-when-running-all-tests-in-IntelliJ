import models.Person;
import org.junit.Test;
import play.test.UnitTest;

import java.util.List;

public class PersonTests extends UnitTest{
    @Test
    public void save() {
        Person p = new Person();
        p.name = "Michael Jackson";
        p.save();

        List<Person> allPeople = Person.all().fetch();
        assertEquals(1, allPeople.size());
        assertEquals("Michael Jackson", allPeople.get(0).name);
    }
}

