package java11.localVar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    SomeService service = new SomeService();

    @Test
    void getIds() {
        var element1 = new VeryLongDescriptiveNameAbbreviationChallengeElement(1L, "badName");
        var element2 = new VeryLongDescriptiveNameAbbreviationChallengeElement(null, "name-1");
        var element3 = new VeryLongDescriptiveNameAbbreviationChallengeElement(3L, "name-2");

        var elements = Arrays.asList(
                element1,
                element2,
                element3
        );

        List<Long> result = service.getIds(elements);


        assertEquals(Arrays.asList(4L), result);
    }
}
