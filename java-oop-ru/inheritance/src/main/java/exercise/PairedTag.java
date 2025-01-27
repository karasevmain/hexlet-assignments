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
        String tagListValues = singleTagList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));

        return String.format("<%s%s>%s%s</%s>", name,makeAttributesAsString(),body,tagListValues,name);
    }
}
// END
