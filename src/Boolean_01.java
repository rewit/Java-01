
public class Boolean_01 {

	public static void main(String[] args) {

		
		boolean bYes = true;
		boolean bNo = false;
		
		// bYes = bYes + true;
		//boolean������ �����ȣ(+,1 : operator)�� ����� �� ����
		
		bYes = 1 == 2; // eq(=)�� 2���� ���(==) �������� ���� �����
		
		System.out.println(bYes);
		
		bYes = 1 == 2 - 1; 
		//eq(=) ��ȣ�� �߽����� �׻� �������� ���� ��ɽ���
		// == �� - �����ȣ�� ��������� -�� ���� ��������� �ȴ�
		// �ᱹ 2-1�� ���Ǿ� ����� 1�� �ǰ�
		// 1�� 1�� �������� �����
		System.out.println(bYes);
		
		bYes = 1 == (2-1);//�򰥸��� ������ ��ȣ�� ���ִ°͵� ����
		
	}

}
