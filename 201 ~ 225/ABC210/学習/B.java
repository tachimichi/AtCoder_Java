package ABC210.学習;

import java.util.Scanner;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] num = new int[a];
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            // System.out.println(num[i]);
        }
        scan.close();
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
