import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // * 提出用のscan
        // * ------------------------------------------------
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        if(a == b) {
            System.out.println(c);
        } else if(b == c) {
            System.out.println(a);
        } else if(a == c) {
            System.out.println(b);
        } else {
            System.out.println(0);
        }
        
    }
}
