package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysSum {

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
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		long ans = 0;
		int mod = 998244353;
		for(int i = 0; i < n; i++) {
			int ele1 = arr1[i];
			int ele2 = arr2[n-i-1];
			int start = i+1;
			int end = n-i;
			long totalTimes = (start*end)%mod;
			long prod = ((totalTimes * ele1)%mod*ele2)%mod;
			ans  = (ans + prod) % mod;
		}
		
		System.out.println(ans);
		
	}

}
