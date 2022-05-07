package Assignment_01;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		System.out.println("Enter the input: ");
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();	
		testClass obj= new testClass();
		obj.display(a);
		inp.close();
	}

}

interface In1{
	void display(int p);
}

interface In2{
	void display(int p);
}

class testClass implements In1,In2
{
	public void display(int p) {
		for(int i=2;i<p;) {
			if(p%i==0) {
				System.out.println(p+" is not a prime number.");
				break;
			}
			else {
				System.out.println(p+" is a prime number.");
				break;
			}
				
		}
	}

}