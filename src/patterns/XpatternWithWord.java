package patterns;

// 13.
public class XpatternWithWord {
    public static void main(String[] args) {
        String s = "PRADEEP";
        int n = s.length();
        for(int i = 0;i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i==j || i+j==n-1 ? s.charAt(i): "  ");
            }
            System.out.println();
        }
    }
}
// Intput
// PRADEEP           ##input should be old number length

//Output
// P     P
//  R   R
//   A A
//    D
//   E E
//  E   E
// P     P
