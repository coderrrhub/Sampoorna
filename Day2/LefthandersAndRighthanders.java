package Day2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class LefthandersAndRighthanders {
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
 
        int n = sc.nextInt();
        String s = sc.next();
 
        int half = n / 2;
 
        for (int i = 0; i < half; i++) {
 
            if (s.charAt(i) == 'R') {
                out.println((i + half + 1) + " " + (i + 1));
            } else {
                out.println((i + 1) + " " + (i + half + 1));
            }
        }
 
        out.close();
    }
}
