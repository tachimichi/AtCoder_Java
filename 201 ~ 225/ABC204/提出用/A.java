import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // * 提出用のscan
        // * ------------------------------------------------
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        if(a == b) {
            System.out.println(a);
        } else {
            System.out.println(3 - (a + b));
        }
    }
}
