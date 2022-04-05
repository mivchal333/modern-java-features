import org.junit.jupiter.api.Test;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetupTest {

    @Test
    void shouldFindRandomGeneratorClass() {
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();

        assertEquals("jdk.random.Xoshiro256PlusPlus", randomGenerator.getClass().getName());
    }
}
