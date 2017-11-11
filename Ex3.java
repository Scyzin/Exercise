/*
	【程序3】
	题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其
	各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1
	的三次方＋5的三次方＋3的三次方。 
	
	程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。

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