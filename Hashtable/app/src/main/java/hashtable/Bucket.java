package hashtable;

public class Bucket<K,V> {
    public K key;
    public V value;
    public Bucket<K,V> next;

    public Bucket(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
