import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int n = sc.nextInt();
        String[] weather = sc.next().split("");
        sc.close();
        System.out.println(weather[n - 1].equals("o") ? "Yes" : "No");
    }
}
