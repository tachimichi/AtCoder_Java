import java.util.*;
// import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int n = sc.nextInt();
        sc.close();

        int count = 0;
        int sum = 0;
        while (sum < n) {
            count++;
            sum += count;
        }
        System.out.println(count);
    }
}
