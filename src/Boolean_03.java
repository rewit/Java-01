
public class Boolean_03 {

	public static void main(String[] args) {

		
		int intNum1 = 30;
		int intNum2 = 50;
		
		boolean bYes = true;
		
		bYes = intNum1 == intNum2;
		//intNum1�� ��� ���� intNum2�� ���� �������� ���°�
		bYes = intNum1 > intNum2;
		//intNum1�� ��� ���� intNum2�� ������ ū���� ���°�
		
		intNum1 = intNum2;
		bYes = intNum1 > intNum2; //��� : false
		
		bYes = intNum1 >= intNum2; //��� : true
		//intNum1�� intNum2���� ũ�ų� ������
		bYes = intNum1 <= intNum2; //��� : true
		//intNum1�� intNum2���� �۰ų� ������
		
		intNum1 = 100;
		bYes = intNum1 == intNum2 ;
		//intNum1�� ���� ����(�б�)�ؼ� intNum2�� ����(����,�Ҵ�)
		//������ ������ ����Ǵ°��� �ƴϴ� 
		//��� false
		
		
		
		
	}

}
