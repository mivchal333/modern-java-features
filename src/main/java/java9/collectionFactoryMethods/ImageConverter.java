package java9.collectionFactoryMethods;

import java.util.Set;
import java.util.TreeSet;

public class ImageConverter {
    private final String JPG_FILE_KEY = "jpg";
    private final String PNG_FILE_KEY = "png";
    private final String BMP_FILE_KEY = "bmp";


    public Set<String> getAvailableFileKeys() {
        // implement here
        // return immutable set of file keys
        return Set.of(JPG_FILE_KEY, PNG_FILE_KEY, BMP_FILE_KEY);
    }
}
