/*
	������1��
	��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
	С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ����
	�����Ӷ���Ϊ���٣� 
	
	������
	�·�	1	2	3	4	5	6
	���Ӷ���1	1	2	3	5	8
*/
import java.util.Scanner;
public class Ex1{
	public static void main(String[] args){
		System.out.println("Ҫ��ѯ���·���");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("��" + n +"�������Ӷ���Ϊ:" + Rabbit(n));
	}
	public static int Rabbit(int a){
		if(a ==1 || a ==2){
			return 1;
		}
		return Rabbit(a-1)+Rabbit(a - 2);
	}
}