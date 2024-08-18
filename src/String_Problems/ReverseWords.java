package String_Problems;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords1(String ds) {
        StringBuffer out = new StringBuffer();
        while (ds.lastIndexOf(" ") > 0) {
            out.append(ds.substring(ds.lastIndexOf(" ") + 1)).append(" ");
            ds = ds.substring(0, ds.lastIndexOf(" "));
        }
        out.append(ds);
        System.out.println(out);
        return out.toString();

    }

    public static String reverseWords(String ds) {
        int index = ds.lastIndexOf(" ");
        if (index > 0)
            return ds.substring(index) + " " + reverseWords(ds.substring(0, index));
        else return ds;
    }

}
