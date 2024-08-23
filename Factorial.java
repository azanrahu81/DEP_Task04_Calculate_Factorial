import java.util.Scanner;


class Factorial
{
	public static void main(String[] args) {
		
		int number;
		long factorial=1;

		Scanner input=new Scanner(System.in);

		System.out.println("Enter Number");
		number =input.nextInt();
		input.close();

		if(number<0)
		{
			System.out.println("Can not find Factor of Negative Number");
		}
		else if(number<=1)
		{
			System.out.printf("%d! = %d",number,factorial);

		}
		else{
			for(int counter=number; counter>=2; counter--)
			{
				factorial = factorial*counter;
			}
			System.out.printf("%d! = %d", number,factorial);
		}



	}
	
}