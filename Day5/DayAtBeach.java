package Day5;

import java.util.Scanner;

public class DayAtBeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt(); 
		}
		
		int[] prefixMax = new int[n];
		prefixMax[0] = arr[0];
		for(int i = 1; i < n; i++) {
			prefixMax[i] = Math.max(arr[i], prefixMax[i-1]);
		}
		
		int[] suffixMin = new int[n];
		suffixMin[n-1] = arr[n-1];
		for(int i = n-2; i >= 0; i--) {
			suffixMin[i] = Math.min(arr[i], suffixMin[i+1]); 
		}
		
		int cnt = 1;
		for(int i = 0; i < n-1; i++) {
			if(prefixMax[i] <= suffixMin[i+1]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
