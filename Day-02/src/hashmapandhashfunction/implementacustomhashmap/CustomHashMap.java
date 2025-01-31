package hashmapandhashfunction.implementacustomhashmap;

import java.util.LinkedList;

public class CustomHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] table;
    private int size;
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public CustomHashMap() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }
    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    }
    public void put(K key, V value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
        size++;
    }
    public V get(K key) {
        int index = hash(key);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }

        return null;
    }
    public void remove(K key) {
        int index = hash(key);

        if (table[index] != null) {
            LinkedList<Entry<K, V>> bucket = table[index];
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    bucket.remove(entry); // Remove the entry
                    size--;
                    return;
                }
            }
        }
    }
    public boolean containsKey(K key) {
        return get(key) != null;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void printAll() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                for (Entry<K, V> entry : table[i]) {
                    System.out.println("Key: " + entry.key + ", Value: " + entry.value);
                }
            }
        }
    }
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        System.out.println("apple: " + map.get("apple"));
        System.out.println("banana: " + map.get("banana"));

        map.put("apple", 50);
        System.out.println("Updated apple: " + map.get("apple"));

        map.remove("banana");
        System.out.println("banana: " + map.get("banana")); // Should print null

        System.out.println("Contains 'orange': " + map.containsKey("orange")); // true
        System.out.println("Contains 'banana': " + map.containsKey("banana")); // false

        map.printAll();

        System.out.println("Size: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());
    }
}



