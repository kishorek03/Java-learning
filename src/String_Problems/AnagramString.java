package String_Problems;

import Array_Problems.SortArray;

import java.util.Arrays;

public class AnagramString extends SortArray {

    public static void toCheckAnagram(String str1, String str2) {
        char[] new1 = str1.toCharArray();
        char[] new2 = str2.toCharArray();
        toSortArray(new1);
        toSortArray(new2);
        if (Arrays.equals(new1, new2)) {
            System.out.println("The Given Strings are Anagram");
        } else {
            System.out.println("The Given Strings are not Anagram");
        }
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        toCheckAnagram(str1, str2);
    }
}
