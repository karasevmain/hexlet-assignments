package exercise;

import java.util.List;

// BEGIN
class LabelTag implements TagInterface {
    String value;
    TagInterface tag;

    LabelTag(String value, TagInterface tag){
        this.value = value;
        this.tag = tag;
    }

    @Override
    public String render() {
        return "<label>" + value + tag.render() + "</label>";
    }
}
// END
