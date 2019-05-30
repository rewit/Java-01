
public class Boolean_01 {

	public static void main(String[] args) {

		
		boolean bYes = true;
		boolean bNo = false;
		
		// bYes = bYes + true;
		//boolean에서는 연산기호(+,1 : operator)를 사용할 수 없다
		
		bYes = 1 == 2; // eq(=)이 2개일 경우(==) 같은지를 묻는 연산식
		
		System.out.println(bYes);
		
		bYes = 1 == 2 - 1; 
		//eq(=) 기호를 중심으로 항상 오른쪽이 먼저 명령실행
		// == 과 - 연산기호는 연산순서가 -가 먼저 연산실행이 된다
		// 결국 2-1이 계산되어 결과가 1이 되고
		// 1과 1이 같은지를 물어본다
		System.out.println(bYes);
		
		bYes = 1 == (2-1);//헷갈릴수 있으니 괄호를 해주는것도 좋다
		
	}

}
