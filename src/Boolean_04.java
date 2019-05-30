
public class Boolean_04 {

	public static void main(String[] args) {

		int intNum1 = 0;
		int intNum2 = 0;
		//intNum1과 intNum2를 사용할 준비를 하는 선언문 clear
		
		int intNum3;
		//변수를 선언할 때 값을 아무것도 대입하지 않으면
		//변수는 사용할 준비가 되지 않은 상태가 된다
		//그러나 변수내용을 읽기를 시도하면 문법오류가 난다
		
		//가능은 하나 좋은 방법은 아님 (오류가 생길 수 있음)
		
		//System.out.println(intNum3);  문법 오류 발생
		intNum3 = 30;
		System.out.println(intNum3);
		//값을 지정해주면 오류가 안남
		
		boolean bYes = true;
		
		int intNum4;
		intNum4 = 0;
		
		intNum1 = 40;
		intNum2 = 50;
		
		bYes = intNum1 == intNum2;  //f
		bYes = intNum1 > intNum2;   //f
		bYes = intNum1 < intNum2;   //t
		bYes = intNum1 >= intNum2;  //f
		bYes = intNum1 <= intNum2;  //t
		
		bYes = intNum1 != intNum2;  //t
		
		intNum1 = intNum2;
		
		bYes = intNum1 != intNum2;
		//!= : not 연산자
		//두 값이 다른지
		
		
		
		
		
	}

}
