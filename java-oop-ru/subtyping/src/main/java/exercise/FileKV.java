package exercise;

import java.util.HashMap;
import java.util.Map;

class FileKV implements KeyValueStorage {
    String path;
    FileKV (String path, Map<String, String> storage) {
        this.path = path;
        Utils.writeFile(path,Utils.serialize(storage));
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> storage = Utils.deserialize(Utils.readFile(path));
        storage.put(key, value);
        Utils.writeFile(path,Utils.serialize(storage));
    }

    @Override
    public void unset(String key) {
        Map<String, String> storage = Utils.deserialize(Utils.readFile(path));
        storage.remove(key);
        Utils.writeFile(path,Utils.serialize(storage));
    }

    @Override
    public String get(String key, String defaultValue) {
        Map<String, String> storage = Utils.deserialize(Utils.readFile(path));
        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(Utils.deserialize(Utils.readFile(path)));
    }
}
