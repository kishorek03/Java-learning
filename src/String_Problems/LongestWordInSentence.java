package String_Problems;

public class LongestWordInSentence {
    public static void main(String[] args) {
        String s="I am preparing for IBM exam";
        System.out.println(longestWordInSentence(s));
    }

    private static String longestWordInSentence(String s) {
        int maxLengthIndex =0;
        String[] str=s.split(" ");
        String longest="";
        for(String words:str){
            if(words.length()>longest.length()){
                longest=words;
            }
        }
        return longest;
    }
}
