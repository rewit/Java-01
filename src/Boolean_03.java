
public class Boolean_03 {

	public static void main(String[] args) {

		
		int intNum1 = 30;
		int intNum2 = 50;
		
		boolean bYes = true;
		
		bYes = intNum1 == intNum2;
		//intNum1에 담긴 값과 intNum2의 값이 같은지를 묻는것
		bYes = intNum1 > intNum2;
		//intNum1에 담긴 값이 intNum2의 값보다 큰지를 묻는것
		
		intNum1 = intNum2;
		bYes = intNum1 > intNum2; //결과 : false
		
		bYes = intNum1 >= intNum2; //결과 : true
		//intNum1이 intNum2보다 크거나 같은지
		bYes = intNum1 <= intNum2; //결과 : true
		//intNum1이 intNum2보다 작거나 같은지
		
		intNum1 = 100;
		bYes = intNum1 == intNum2 ;
		//intNum1의 값을 복사(읽기)해서 intNum2에 저장(대입,할당)
		//변수가 변수에 저장되는것이 아니다 
		//결과 false
		
		
		
		
	}

}
