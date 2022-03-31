package week1.day1;

public class MyMobile {
	public long mobileNumber = 9824338955l;
	public String brand = "oneplus";

	public void makeCall()
	{
		System.out.println("hello");
	}

	public void sendMsg()
	{
		System.out.println("how are you");
	}

	private void payBill()
	{
		System.out.println("please pay bills");
	}

	public static void main(String[] args)
	{
		MyMobile obj = new MyMobile();
		System.out.println(obj.brand);
		System.out.println(obj.mobileNumber);
		obj.makeCall();
		obj.sendMsg();
		obj.payBill();

	}

}
