package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {
    String body;
    List<Tag> singleTagList;

    PairedTag(String name, Map<String, String> attributes, String body, List<Tag> singleTagList) {
        super(name, attributes);
        this.body = body;
        this.singleTagList = singleTagList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("<").append(name);
        var entries = attributes.entrySet();
        for (var entry : entries) {
            result.append(" ");
            result.append(entry.getKey());
            result.append("=\"").append(entry.getValue()).append("\"");
        }
        result.append(">");
        result.append(body);
        singleTagList.forEach(x -> {
            result.append(x.toString());
        });
        result.append("</").append(name).append(">");
        return result.toString();
    }
}
// END
