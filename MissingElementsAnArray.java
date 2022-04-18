package week1.day2;

public class MissingElementsAnArray {
	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=i)
			{
				System.out.println("Iteration is not equal to array value");
			}
				
				
			
		}
	}

}
