package Duplicatrchar;

import java.util.HashMap;

public class Duplicate {

    public  boolean isDuplicateChar(String sentence){
        HashMap<Character,Character> hashMap=new HashMap<Character,Character>();
        String sentence2=sentence.toLowerCase();

        for (int i = 0; i < sentence2.length(); i++) {
            char lestter=sentence2.charAt(i);

            if(hashMap.containsValue(sentence2.charAt(i))){

                return false;
            }
            if(lestter != ' '){
                hashMap.put( sentence2.charAt(i), sentence2.charAt(i));
            }
        }
        return true;
    }
}
