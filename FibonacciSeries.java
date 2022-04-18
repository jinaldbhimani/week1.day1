package week1.day1.assignmnets;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int firstNum=0;
		int secondNum=1;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for (int i = 1; i <=8; i++) {
			int sum;
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.println(sum);
			
		}

	}

}
