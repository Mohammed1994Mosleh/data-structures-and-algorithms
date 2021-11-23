package leftJoins;

import java.util.HashMap;

public class HashmapLeftJoinClass {

    public HashMap<String, String> hashMapLeftJoinFunction(HashMap<String,String> hashMapOne, HashMap<String,String> hashMapTow){
        //1. create new HashMab to put result
        HashMap<String,String>resultTow=new HashMap<>();
//        List<HashMap> result=new ArrayList<>();
//        List<HashMap> keys=new ArrayList<>();
//        keys.add((HashMap) hashMapOne.entrySet());
//        result.add((HashMap) hashMapTow.entrySet());
//        result.add(hashMapOne.entrySet());
        // 2. looping through hashMapOneKeys and check if hashMapTow contains(hashMapOneKeys)
        for (String hashMapOneKeys :hashMapOne.keySet()) {
//             hashMapOneKeys.toLowerCase();
//             hashMapTow.keySet().toString().toLowerCase();
            if (hashMapTow.containsKey(hashMapOneKeys)) {
                //// 3. create String to join to value from tow Hash mab by getting by it key
                String kER=" "+(hashMapOne.get(hashMapOneKeys)+","+hashMapTow.get(hashMapOneKeys)+" ");
                /// 4. put name of key and values for tow hash map that related to the same kay inside result hash mab
                resultTow.put(hashMapOneKeys,kER);

//                result.put(hashMapOneKeys,hashMapTow.get(hashMapOneKeys));

//                     result.add((HashMap) hashMapTowKeys.entrySet());
            }else {
                // 5. else there is no same key in second Hash Mab so create new string and join first value with null
                String kER2=" "+(hashMapOne.get(hashMapOneKeys)+",null ");
                //6. updated result hash map
                resultTow.put(hashMapOneKeys,kER2);
            }
        }
        //7. return result
        return resultTow;
    }
}