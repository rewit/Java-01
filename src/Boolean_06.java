
public class Boolean_06 {

	public static void main(String[] args) {

		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		boolean bYes = true;
		// && = (And 연산) 두개 이상의 비교연산 결과가 모두 true인가를 판단
		bYes = num1 == num2 && num3 == num4; // f & f = f
		bYes = num1 == num1 && num3 == num4; // t & f = f
		bYes = num1 == num2 && num3 == num3; // f & t = f
		bYes = num2 == num2 && num3 == num3; // t & t = t
		
		//|| = (OR 연산) 두개 이상의 비교연산 결과 중 1개라도  true인지를 판단
		bYes = num1 == num2 || num3 == num4; // f or f = f
		bYes = num1 == num1 || num3 == num4; // t or f = t
		bYes = num1 == num2 || num3 == num3; // f or t = t
		bYes = num1 == num1 || num3 == num3; // t or t = t
		
		bYes = num1 == num2 || num3 == num3 && num4 == num3;
		//괄호()가 없는 경우and 와 or 복합적인 경우 and 우선
		//false or false and false = false  
		
		bYes = (num1 == num2 || num3 == num3) && num4 == num3;
		//(false or false) and false = false
		
		
	}

}
