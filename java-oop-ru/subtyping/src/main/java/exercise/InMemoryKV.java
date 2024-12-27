package exercise;

import java.util.Map;
import java.util.HashMap;

class InMemoryKV implements KeyValueStorage {
    Map<String, String> storage;

    InMemoryKV (Map<String, String> storage) {
        this.storage = new HashMap<>(storage);
    }
    @Override
    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue);
    }
    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }
    @Override
    public void unset(String key) {
        storage.remove(key);
    }
    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }
}
