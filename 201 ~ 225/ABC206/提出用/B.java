import java.util.*;
// import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int n = scan.nextInt();
        scan.close();

        int count = 0;
        int sum = 0;
        while(sum < n) {
            count++;
            sum += count;
        }
        System.out.println(count);
    }
}
