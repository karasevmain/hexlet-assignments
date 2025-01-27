package exercise;

// BEGIN
class InputTag implements TagInterface {
    String type;
    String vale;

    InputTag(String type, String vale) {
        this.type = type;
        this.vale = vale;
    }
    @Override
    public String render() {
        return "<input type=\"" + type + "\" value=\"" + vale + "\">";
    }
}
// END
