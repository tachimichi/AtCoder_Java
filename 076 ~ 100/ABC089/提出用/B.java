import java.util.Scanner;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int n = scan.nextInt();
        String a[] = new String[n];

        String ans = "Three";
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.next();
            // System.out.println(a[i]);
            if(a[i].equals("Y")) {
                ans = "Four";
                // System.out.println(a[i]);
            }
        }
        scan.close();
        System.out.println(ans);
    }
}
