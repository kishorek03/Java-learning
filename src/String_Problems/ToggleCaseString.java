package String_Problems;


public class ToggleCaseString {
    public static void main(String[] args) {
        String s="HeLloWoRlD";
        System.out.println(toToggleCase(s));

    }

    private static String toToggleCase(String s) {
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
