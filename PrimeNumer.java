package week1.day1.assignmnets;

public class PrimeNumer {

	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		
		for (int i = 2; i<=100; i++)
		{
			flag=input%i==0;
			flag=true;
			
		}	
			
			if (flag=true)
			{
				System.out.println("prime");
			}
			else if(flag=false)
			{
				System.out.println("not prime");
			}
			
			
			
			
			
		}

	}

}
