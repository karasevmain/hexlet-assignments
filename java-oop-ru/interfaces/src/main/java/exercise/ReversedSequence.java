package exercise;
class ReversedSequence implements CharSequence {
    private String charSequence;
    ReversedSequence(String string) {
        this.charSequence = new StringBuilder(string).reverse().toString();
    }
    @Override
    public int length() {
        return this.charSequence.length();
    }
    @Override
    public char charAt(int index) {
        return charSequence.charAt(index);
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        return charSequence.substring(start, end);
    }
    @Override
    public String toString() {
        return charSequence;
    }
}
