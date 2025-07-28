package String_Problems;

import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String s = sc.nextLine();

        if (s.contains("[") && s.contains("]")) {
            System.out.println("Decoded String: " + decodeWithBrackets(s));
        } else {
            System.out.println("Decoded String: " + decodeSimple(s));
        }
    }

    public static String decodeSimple(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int count = s.charAt(i) - '0'; // Convert char digit to int
                if (i + 1 < s.length() && Character.isLetter(s.charAt(i + 1))) {
                    char ch = s.charAt(i + 1);
                    for (int j = 0; j < count; j++) {
                        result.append(ch);
                    }
                }
            }
        }
        return result.toString();
    }

    public static String decodeWithBrackets(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // Handle multi-digit numbers
            } else if (c == '[') {
                countStack.push(num);
                stringStack.push(current);
                current = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                StringBuilder temp = current;
                current = stringStack.pop();
                int repeat = countStack.pop();
                for (int i = 0; i < repeat; i++) {
                    current.append(temp);
                }
            } else {
                current.append(c);
            }
        }
        return current.toString();
    }
}
