package java11.localVar;

import java.util.List;
import java.util.stream.Collectors;

public class SomeService {

    List<Long> getIds(List<VeryLongDescriptiveNameAbbreviationChallengeElement> elements) {
        // implement here
        // rewrite using var in streams

        return elements.stream()
                .filter((@MyAnnotation VeryLongDescriptiveNameAbbreviationChallengeElement element) -> element.getId() != null)
                .filter((@MyAnnotation VeryLongDescriptiveNameAbbreviationChallengeElement element) -> element.getName().startsWith("name-") )
                .map( (VeryLongDescriptiveNameAbbreviationChallengeElement element) -> element.getId() + 1)
                .collect(Collectors.toList());
    }
}
