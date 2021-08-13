import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
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
