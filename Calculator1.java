package week1.day2;

public class Calculator1 {

	
	public int add(int d,int e,	int f) {
		
		 int result;
		result=d+e+f;
		return result;
		
	}
	
	public int sub(int d,int e) {
		int result;
		result=d-e;
	return result;
	
}
	
public double mul(double g,double h) {
	 double Result1;
	Result1=g*h;
	return Result1;
}

public float div(float i,float j) {
float Result1;
	Result1=i/j;
	return Result1;
}

public static void main(String[] args) {
	
	Calculator1 FinalResult=new Calculator1();

	System.out.println("Addition result is :"+FinalResult.add(50, 10, 90));
	System.out.println("Subtraction result is :"+FinalResult.sub(50, 10));
	System.out.println("Multiplcation result is :"+FinalResult.mul(100.344325d, 10));
	System.out.println("Division result is :"+FinalResult.div(100.34f, 10.56f));
	
	

	

	
	
}

}
