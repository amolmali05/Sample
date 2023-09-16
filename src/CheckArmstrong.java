import java.util.Scanner;

public class CheckArmstrong {
	static int sum;
	public int check(int number)
	{
		String digit=Integer.toString(number);
		
		for (int i = 0; i < digit.length(); i++) {
			
			char ch=digit.charAt(i);
			int no=Character.getNumericValue(ch);
			sum=sum+getCube(no);
			
			
		}
		
		
		return sum;
	}
	
	public int getCube(int number)
	{
		return number*number*number;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter number to Check armstrong number or not");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		CheckArmstrong checkarmstrong=new CheckArmstrong();
		int result=checkarmstrong.check(number);
		
		if (result!=number) {
			System.out.println("Not Armstrong Number");
			
		}
		
		else {
			System.out.println("Armstrong number");
		}
		
	}

}
