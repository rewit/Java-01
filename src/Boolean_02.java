
public class Boolean_02 {

	public static void main(String[] args) {

		
		int intNum = 20;
		Boolean bYes = true;
		
		bYes = intNum == 50;
		
		System.out.println(bYes);
		
		bYes = intNum == intNum - 30;                
		bYes = 1 == -1;
		
		// 1. intNum�� ��� 20�� ������ġ�� ��������
		// 2. ��򰡿� ����� 30�� ������ġ�� ��������
		// 3. intNum���� 30�� ����, ��� -10
		// 4. intNum�� ��� 20�� ������ġ�� ��������
		// 5. 3������ ���� ��� -10�� ������ġ�� ��������
		// 6. �� ���� �� �� ����� false�� bYes�� ���
		
	
	}

}
