package exercise;

import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int count) {

        return homes.stream()
                .sorted(new Comparator<Home>() {
                    @Override
                    public int compare(Home o1, Home o2) {
                        return o1.compareTo(o2);
                    }
                })
                .map(Object::toString)
                .limit(count)
                .toList();
    }
}
// END
