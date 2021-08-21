package ABC209.\u5b66\u7fd2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] num = new int[a];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            // System.out.println(num[i]);
        }
        sc.close();
        // System.out.println(num);
        for (int i = 0; i < a; i++) {
            if (i % 2 == 1) {
                num[i]--;
            }
            b -= num[i];
        }
        if (b < 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
