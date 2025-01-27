package exercise;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
class Tag {
    String name;
    Map<String, String> attributes;

    Tag (String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }
}
// END
