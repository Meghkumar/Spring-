package capagemini;

import java.awt.event.MouseAdapter;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("two");
			
			
		} catch (RuntimeException ex) {
			System.out.println("catch");
		}
		
		finally {
			
			System.out.println("finally");
		}
		
		
	}

}
