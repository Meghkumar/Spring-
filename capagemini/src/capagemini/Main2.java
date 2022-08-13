package capagemini;

import java.util.Scanner;

public class Main2 {
	
	public static int uniquePlants(int N, int[] H) {
		
		
		int result = -404;
		
		return result;
	
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			
			H[i] = sc.nextInt();
			
		}
		sc.close();
		
		System.out.println(uniquePlants(N, H));
	}
	
}
