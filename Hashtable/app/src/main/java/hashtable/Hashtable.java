package hashtable;

import java.util.ArrayList;

class HashTable <K,V>{
    public ArrayList<Bucket<K,V>> hashTable;
    int numBuckets;
    int tableSize;


    public HashTable() {
        hashTable = new ArrayList<>();
        numBuckets = 15;
        tableSize = 0;

        // Create empty chains
        for (int i = 0; i < numBuckets; i++)
            hashTable.add(null);
    }


    public int hash(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        // hashCode could be negative.
        index = index < 0 ? index * -1 : index;
        return index;
    }



    // Returns value for a key
    public V get(K key) {
        // Find head of chain for given key
        int bucketIndex = hash(key);

        Bucket<K,V> head = hashTable.get(bucketIndex);

        // Search key in chain
        while (head != null) {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }

        // If key not found
        System.out.println("The key is not found");
        return null;
    }


    // check if it contains a key
    public boolean contains(K key)
    {
        // Find head of chain for given key
        int bucketIndex = hash(key);

        Bucket<K,V> head = hashTable.get(bucketIndex);

        // Search key in chain
        while (head != null) {
            if (head.key.equals(key))
                return true;
            head = head.next;
        }

        // If key not found
        System.out.println("The key is not found");
        return false;
    }


    public void add(K key, V value) {
        // Find head of chain for given key
        int bucketIndex = hash(key);
        Bucket<K, V> head = hashTable.get(bucketIndex);

        // Check if key is already present
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert key in chain
        tableSize++;
        head = hashTable.get(bucketIndex);
        Bucket<K, V> newNode
                = new Bucket<>(key, value);
        newNode.next = head;
        hashTable.set(bucketIndex, newNode);

        // If load factor goes beyond threshold, then
        // double hash table size
        if ((1.0 * tableSize) / numBuckets >= 0.7) {
            ArrayList<Bucket<K,V> > temp = hashTable;
            hashTable = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            tableSize = 0;
            for (int i = 0; i < numBuckets; i++)
                hashTable.add(null);

            for (Bucket<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public int size() {
        return tableSize;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "hashTable=" + hashTable +
                '}';
    }
}