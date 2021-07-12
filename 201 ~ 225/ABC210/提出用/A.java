package ABC210.提出用;

import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

        int ans = 0;
        for(int i = a; i <= b; i++) {
            ans++;
        }
        System.out.println(ans);
    }
}
