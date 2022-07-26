package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input: String array
     * @return number of duplicate elements in an array of strings
     */
    public Integer countDuplicates(String[] input){
        //map hold each element in the arr and the number of times it occurs in the arr
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word: input){
            if(map.containsKey(word)){
                Integer val = map.get(word);
                map.put(word, val + 1);
            } else {
                map.put(word, 1);
            }
        }
        //iterate over map to count the number of duplicate elements
        Integer numOfDuplicates = 0;
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1)
                numOfDuplicates++;
        }
        return numOfDuplicates;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer num: input){
            if(map.containsKey(num)){
                Integer val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }

        Integer numOfDuplicates = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1)
                numOfDuplicates++;
        }
        return numOfDuplicates;
    }
}
