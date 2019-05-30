
public class Boolean_07 {

	public static void main(String[] args) {

		
		int num1= 10;
		int num2= 20;
		int num3= 30;
		int num4= 40;
		
		boolean bYes = true;
		
		bYes = num1 > num2 && num3 > num4 ; // false && false = false 
		bYes = num1 < num2 && num3 < num4 ; // true  && true  = true
		
		bYes = num1 > num2 || num3 < num4 ; // false || true  = true   //   
		bYes = num1 < num2 || num3 > num4 ; // true  || false = true
		
	}

}
