package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class App {
    public static void swapKeyValue (KeyValueStorage storage) {
        LinkedHashMap<String, String> storageMap = new LinkedHashMap<>(storage.toMap());
        Set<String> keys = storageMap.keySet();
        for (String key : keys) {
            var value = storage.get(key, "default");
            storage.unset(key);
            storage.set(value, key);
        }
    }
}
