/*
	【程序1】
	题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
	小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月
	的兔子对数为多少？ 
	
	分析：
	月份	1	2	3	4	5	6
	兔子对数1	1	2	3	5	8
*/
import java.util.Scanner;
public class Ex1{
	public static void main(String[] args){
		System.out.println("要查询的月份是");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("第" + n +"个月兔子对数为:" + Rabbit(n));
	}
	public static int Rabbit(int a){
		if(a ==1 || a ==2){
			return 1;
		}
		return Rabbit(a-1)+Rabbit(a - 2);
	}
}