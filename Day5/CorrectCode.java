package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class CorrectCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for(int i = 0; i < n; i++) {
			arr1[i] = scanner.nextInt(); 
		}
		
		for(int i = 0; i < n; i++) {
			arr2[i] = scanner.nextInt(); 
		}
		
		int mod = 998244353;
		long[] weight1 = new long[n];
		for(int i = 0; i < n; i++) {
			long start = i+1;
			int end = n-i;
			long ele = arr1[i];
			long totalTimes = start*end;
			
			weight1[i] = ele * totalTimes;
		}
		
//		Arrays.sort(arr1); // we cannot do this
		Arrays.sort(weight1); 
		Arrays.sort(arr2);
		long ans = 0;
		for(int i = 0; i < n; i++) {
			long ele1 = weight1[i];
			int ele2 = arr2[n-i-1];
			long prod = ((ele1)%mod * (ele2)%mod) % mod; 
			ans  = (ans + prod) % mod;
		}
		
		System.out.println(ans);
	}

}
