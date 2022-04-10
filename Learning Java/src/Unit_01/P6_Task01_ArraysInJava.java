package Unit_01;

public class P6_Task01_ArraysInJava {

	public static void main(String[] args) {
		
		//Declaration
		int array1[];
		//int[] array2;
		//int []array3;
		
		array1 = new int[6];
		
		for(int i=0; i< array1.length; i++) //length is the property of array
			array1[i] = i;
		
		int array4[]= {32,23,43,54,12}; //Declaration, initialization, instantiation
		
		//passing array to method
		arrayAsParameter(array4);
		
		//passing anonymous array in a method
		arrayAsParameter(new int[] {2,3,4,5,6,7,8});
		
		//Returning array from the Method
		int[] array5 = arrayAsReturnType();
		System.out.println(array5.toString());
		
		//ArraynIndexOutOfBoundsException
		int arr[]= {2,4,6,8};
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//Multidimensional Array in Java
		int[][] arr6 =new int[3][3];
		
		for(int i=0,j=0;i<3 && j<3; i++,j++) {
			System.out.println(arr6[i][j]);
		}
		
		int counter =0;
		for(int i=0,j=0;i<3 && j<3; i++,j++)
		{
			counter++;
			arr6[i][j]=counter;
		}
		
		for(int i=0,j=0; i<3 && j<3; i++,j++)
		{
			System.out.println(arr6[i][j]);
		}
	}
	
	static void arrayAsParameter(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
	static int[] arrayAsReturnType() {
		int array4[]= {2,4,6,8};
		
		return array4;
	}

}