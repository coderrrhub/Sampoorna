package Day2;

import java.util.Scanner;

public class TavasAndNafas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
 
        String[] ones = {
            "zero","one","two","three","four","five",
            "six","seven","eight","nine","ten","eleven",
            "twelve","thirteen","fourteen","fifteen",
            "sixteen","seventeen","eighteen","nineteen"
        };
 
        String[] tens = {
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
        };
 
        if (s < 20) {
            System.out.println(ones[s]);
        } else {
            int t = s / 10;
            int o = s % 10;
 
            if (o == 0) {
                System.out.println(tens[t]);
            } else {
                System.out.println(tens[t] + "-" + ones[o]);
            }
        }
    }
}
