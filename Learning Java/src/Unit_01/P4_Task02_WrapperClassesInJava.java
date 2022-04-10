package Unit_01;

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		// Convert int into Integer
		int a=20;
		
		String s= ""+ a +"";
		
		Integer i= Integer.valueOf(a); //converting int into integer explicitly
		Integer j= a; //autoboxing, now compiler will write integer.valueof(a) internally
		
		System.out.println(a + " " + i + " " + j);
		System.out.println(i.toString());
		//System.out.println(a.toString());
		//a.toString() cannot be done as a is int and not object
		//Autoboxing: Converting primitive into objects
		
		byte b=10;
		Byte byteobj = b;
		
		System.out.println(byteobj);
		
		//Unboxing: Converting objects to primitives
		byte bytevalue= byteobj;
		System.out.println(bytevalue);

	}

}