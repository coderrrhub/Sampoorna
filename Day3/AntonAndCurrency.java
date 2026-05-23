package Day3;
import java.util.*;

public class AntonAndCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int n = arr.length;
        int last = arr[n-1] - '0';
        int j = -1;
        for(int i = 0; i < n; i++) {
            int ch = arr[i] - '0';
            
            if(ch % 2 == 0) {
                j = i;
                
              if(ch < last)
                break;
            }
        }
        
        if(j == -1) {
            System.out.println(-1);
        } else {
            int temp = arr[n-1];
            arr[n-1] = arr[j];
            arr[j] = (char)temp;
            System.out.println(new String(arr));
        }
    }
}
