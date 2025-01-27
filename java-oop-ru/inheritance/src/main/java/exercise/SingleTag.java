package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag{
    SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public String toString () {
        StringBuilder result = new StringBuilder();
        result.append("<").append(name);
        var entries = attributes.entrySet();
        for (var entry : entries) {
            result.append(" ");
            result.append(entry.getKey());
            result.append("=\"").append(entry.getValue()).append("\"");
        }
        return result.append(">").toString();
    }
}
// END
