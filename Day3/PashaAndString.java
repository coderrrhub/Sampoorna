package Day3;

import java.util.Scanner;

public class PashaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr = sc.next().toCharArray();
        int n = sc.nextInt();
        int[] diff = new int[arr.length];
        for(int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            int end = arr.length - ele;
            diff[ele-1]++;
            if(end+1 < diff.length) {
                diff[end+1]--;
            }
        }
        
        for(int i = 1; i < diff.length; i++) {
            diff[i] += diff[i-1];
        }
        
        for(int i = 0; i < diff.length/2; i++) {
            if(diff[i] % 2 == 1) {
                char temp = arr[arr.length-i-1];
                arr[arr.length-i-1] = arr[i];
                arr[i] = temp;
            }
        }
        
        System.out.println(new String(arr));
    }
}