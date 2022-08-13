package pratice;

public class Pratice {

	

	public static void main(String[] args) {
		
	
	int n = 53;
	
	if(n==0||n==1)
	{
		System.out.println("no");
	}
	
	for (int i = 2; i < n; i++) {
		if(n%i==0)
		{
			System.out.println("no");
			return;
		}
		else {
			System.out.println("prime");
		}
		
	}
	
}
	

}
