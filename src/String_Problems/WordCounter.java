package String_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    public static List<String> wordFind(String s){
        Map<String,Integer> freq=new HashMap<>();
        List<String> result=new ArrayList<>();
        if(s == null || s.trim().isEmpty()){
            return new ArrayList<>();
        }
        s = s.toLowerCase().replaceAll("[^a-z\\s]", "");
        String [] words =s.trim().toLowerCase().split("\\s+");
        for(String word:words){
            freq.put(word,freq.getOrDefault(word,0)+1 );
        }
        for(Map.Entry<String,Integer>mp:freq.entrySet()){
            if(mp.getValue()>1){
                result.add(mp.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="This is a test. This test is only a test.";
        System.out.println(wordFind(s));

    }
}

