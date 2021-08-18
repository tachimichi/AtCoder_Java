import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
        // * ---------------------------
        String a = scan.next();
        scan.close();

        char arr[] = new char[a.length()];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a.charAt(i);
            if(arr[i] == "6") {
                arr[i] = "9";
                continue;
            }
            if(arr[i] == "9") {
                arr[i] = "6";
                continue;
            }
        }
        System.out.println(Arrays.toString(arr);

    }
}
