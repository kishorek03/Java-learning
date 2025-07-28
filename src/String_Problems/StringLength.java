package String_Problems;

public class StringLength {
    public static int stringLength(String s){
        int length=0;
        while (true){
            try {
                s.charAt(length);
                length++;
            }catch(IndexOutOfBoundsException e){
                break;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(stringLength("sai"));
    }
}
