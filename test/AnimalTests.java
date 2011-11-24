import models.Animal;
import org.junit.Test;
import play.test.UnitTest;

import java.util.List;

public class AnimalTests extends UnitTest {
    @Test
    public void sanity() {
        Animal dog = new Animal();
        dog.legs = 4;
        dog.save();

        Animal bird = new Animal();
        bird.legs = 2;
        bird.save();

        List<Animal> animals = Animal.all().fetch();
        assertEquals(2, animals.size());
    }
}
