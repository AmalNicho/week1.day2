package week1.day2;

public class ArrayMatch {
	
	
	public static void main(String[] args) {
		
		int[] array1= {1,2,3,4,5};
		int[] array2= {1,2,3,4,5};
		
		for (int i = 0; i < array1.length; i++) {
					if (array1[i]==array2[i])
				
				System.out.println("both arrays are matching "+array1[i]+" "+array2[i]);	
				
				else {
					System.out.println( i + " is not matching "+array1[i]+" "+array2[i]);
break;
}
				
		
			
		}
		
		
	}

}
