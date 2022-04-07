package java10.optionalOrElseThrow;

import java.util.Optional;

public class DataProvider {

    Optional<String> getUsername(int id) {
        return id < 3
                ? Optional.empty()
                : Optional.of("user-" + id);
    }

}
