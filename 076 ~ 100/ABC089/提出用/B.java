import java.util.Scanner;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int n = sc.nextInt();
        String a[] = new String[n];

        String ans = "Three";
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
            // System.out.println(a[i]);
            if (a[i].equals("Y")) {
                ans = "Four";
                // System.out.println(a[i]);
            }
        }
        sc.close();
        System.out.println(ans);
    }
}
