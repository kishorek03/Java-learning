package String_Problems;

public class Reverse_String {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
    }
    public static String reverse(String s){
        char[] c=s.toCharArray();
        StringBuilder reversestring=new StringBuilder();
        for(int i=c.length-1;i>=0;i--){
            reversestring.append(c[i]);

        }
        return reversestring.toString();


    }


    public static void main(String[] args) {
        System.out.println(reverse("sam"));
    }
}
