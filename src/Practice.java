import java.util.HashMap;

public class Practice {
    public int [] twoSum(int [] arr,int target){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int temp=target-arr[i];
            if(mp.containsKey(temp)){
               return new int[]{mp.get(temp),i};
            }
            mp.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public char nonRepeatingchar(String s){
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(mp.get(c)==1)return c;
        }

        return '\0';
    }
}
