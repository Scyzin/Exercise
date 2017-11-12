/*
	【程序4】
	题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

*/
import java.util.Scanner;
public class Ex4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个正整数");
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