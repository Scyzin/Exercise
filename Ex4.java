/*
	������4��
	��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��

*/
import java.util.Scanner;
public class Ex4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������");
		int num = sc.nextInt();
		decompose(num);
		
	}
	public static void decompose(int n){
		System.out.print( n +"= ");
		for(int i = 2;i < n;i++){
			while(n % i ==0 && n !=i){
				n /=i;
				System.out.print(i + "*");
			}
			if(n ==i){
				System.out.print(i);
				break;
			}
		}
	}
}