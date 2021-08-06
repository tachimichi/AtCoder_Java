import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int n = scan.nextInt();
        int a = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();

        int ans;
        if(n > a) {
            ans = a * x + (n - a) * y;
        } else {
            ans = n * x;
        }
        System.out.println(ans);
    }
}
