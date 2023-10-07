package week5work;
/*Nirdesh Chauhan
* Student id: 4542332
* Computer Programming G11
*/
public class week5{
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println("The value of c is: "+c);
	}
	public void sum() {
		System.out.println("Welcome");
	}
	static void  max(int num1,int num2) {
		int result;
		if(num1>num2) {
		result=num1;
		}
		else {
			result=num2;
		}
		System.out.println("The result is: "+ result);
	}
	public static void main(String[] args) {
	week5 z=new week5();
		z.sum(10,20);
		z.sum();
		max(10,20);
	}
}