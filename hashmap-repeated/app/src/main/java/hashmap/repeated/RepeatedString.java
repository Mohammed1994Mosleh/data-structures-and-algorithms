package hashmap.repeated;

import java.util.HashMap;

public class RepeatedString {

    public  String repeatedWord(String sentence) {
        HashMap<String,String> hashTable = new HashMap<>();
        String[] allWords = sentence.toLowerCase().replace(",", "").split(" ");
        for (String word : allWords) {
            if (hashTable.containsKey(word)) return word;
            else hashTable.put(word, word);
        }
        return null;
    }
}
