/*
	������3��
	��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ������
	��λ���������͵��ڸ����������磺153��һ��"ˮ�ɻ���"����Ϊ153=1
	�����η���5�����η���3�����η��� 
	
	�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��

*/
class Ex3{
	public static void main(String[] args){
		for(int i = 100; i < 1000;i++ ){
			if(isNarcissus(i)){
				System.out.print(i +" ");
			}
		}
		System.out.println();
	}
	public static boolean isNarcissus(int num){
		int ge = num % 10;
		int shi = num / 10 % 10;
		int bai = num / 100 % 10;
		int narcissus = ge*ge*ge + shi*shi*shi + bai*bai*bai;
		if(num == narcissus){
			return true;
		}
		return false;
	}
	
}