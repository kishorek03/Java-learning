package String_Problems;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
       s=s.trim();
       String[] str=s.split(" ");
       String lastword=str[str.length-1];
        return lastword.length();
    }

    public static int lengthOfLastWord1(String s) {
        return s.substring(s.trim().lastIndexOf(" ")+1).length();
    }
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

}
