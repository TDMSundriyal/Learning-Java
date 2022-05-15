package Unit_03;
import java.util.Scanner;

public class P14_ExceptionHandling {

	public static void main(String[] args) {
		
		ABC obj= new ABC();
		//obj.basicException();
		//obj.handleException();
		//obj.multipleCatch();
		//obj.inputMismatchException();
		//obj.stackOverFlowError();
		//obj.indexOutOfBoundException();
		obj.nullPointerException();
	}

}

class ABC{
	Scanner sc= new Scanner(System.in);
	void basicException()
	{
		int b=0;
		int a=100/b;
		System.out.println(a);
		
		System.out.println("Done!");
	}
	
	void handleException()
	{
		try {
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Done!");
	}
	
	void multipleCatch()
	{
		try {
			System.out.println("Enter the value: ");
			int b= sc.nextInt();
			int a=100/b;
			System.out.println(a);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Done!");
	}
	
	void inputMismatchException() 
	{
		try {
			System.out.println("Enter the value: ");
			byte a= sc.nextByte();
			System.out.println(a);	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
	}
	
	void stackOverFlowError() 
	{
		int i=10;
		try {
		while(i>3)
		{
			i++;
			stackOverFlowError();
			System.out.println(i);
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
		
	}
	
	void indexOutOfBoundException()
	{
		int arr[]= {2,4,6};
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
	}
	
	
	void nullPointerException()
	{
		try {
			String s = null;
			System.out.println(s.length());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
		System.out.println("Done!");
	}
}