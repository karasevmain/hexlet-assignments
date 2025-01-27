package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag{
    SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public String toString () {
        return String.format("<%s%s>", name, makeAttributesAsString());
    }
}
// END
