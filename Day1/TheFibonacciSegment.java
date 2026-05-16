import java.util.*;
public class TheFibonacciSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(findMaxLength(n, arr));
    }
    
    public static int findMaxLength(int n, int[] arr) {
        if(n == 1 || n == 2) {
            return n;
        }
        
        int max = 0;
        int cnt = 2;
        for(int i = 2; i < arr.length; i++) {
            if(arr[i] == arr[i-1] + arr[i-2]) {
                cnt++;
            } else {
                cnt = 2;
            }
            
            max = Math.max(max, cnt);
        }
        
        return max;
    }
}