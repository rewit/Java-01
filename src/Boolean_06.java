
public class Boolean_06 {

	public static void main(String[] args) {

		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		boolean bYes = true;
		// && = (And ����) �ΰ� �̻��� �񱳿��� ����� ��� true�ΰ��� �Ǵ�
		bYes = num1 == num2 && num3 == num4; // f & f = f
		bYes = num1 == num1 && num3 == num4; // t & f = f
		bYes = num1 == num2 && num3 == num3; // f & t = f
		bYes = num2 == num2 && num3 == num3; // t & t = t
		
		//|| = (OR ����) �ΰ� �̻��� �񱳿��� ��� �� 1����  true������ �Ǵ�
		bYes = num1 == num2 || num3 == num4; // f or f = f
		bYes = num1 == num1 || num3 == num4; // t or f = t
		bYes = num1 == num2 || num3 == num3; // f or t = t
		bYes = num1 == num1 || num3 == num3; // t or t = t
		
		bYes = num1 == num2 || num3 == num3 && num4 == num3;
		//��ȣ()�� ���� ���and �� or �������� ��� and �켱
		//false or false and false = false  
		
		bYes = (num1 == num2 || num3 == num3) && num4 == num3;
		//(false or false) and false = false
		
		
	}

}
