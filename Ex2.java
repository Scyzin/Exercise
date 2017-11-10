/*
【程序2】
题目：判断101-200之间有多少个素数，并输出所有素数。
	需求：1.输出素数个数
		  2.输出所有素数
	
	分析：
		素数：不能被1以及自身整除的数。
	
		算法：
			int count==0;//素数的个数
			int number; //
			从2开始整除到a/2
			for(int a =2; a < number/2;a++ ){
			if(number % a == 0){
				//不是素数
			}
			
*/
class Ex2{
	public static void main(String[] args){
		final int num_of = 10;
		int count = 0;//统计素数个数
		int number = 101;
		System.out.print("100-200之间的素数为：");
		while(number >= 100 && number <=200){
			boolean isPrime = true;
			for(int a = 2; a < number/2;a++){
				if(number % a ==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				count++;
				if(count % num_of == 0){
					System.out.println(number);
				}
				else{
					System.out.print(number +" ");
				}	
			}
			number++;
			}
			System.out.println();
			System.out.println("100-200之间的素数个数为:" + count);
		}
	}

	/*
	public static void main(String[] args){
		int m = 100;
		int n = 200;
		int count = 0;
		//统计素数个数
		for(int i=m;i<n;i++){
			if(isPrime(i)){
				count++;
				System.out.print(i+" ");
				if(count%10==0){
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("在"+m+"和"+n+"之间共有"+count+"个素数");
		System.out.println(Math.sqrt(n));
	}
	//判断素数
	private static boolean isPrime(int n){
		boolean flag = true;
		if(n==1)
		  flag = false;
		else{
			for(int i=2;i<=Math.sqrt(n);i++){
			if((n%i)==0 || n==1){
				flag = false;
				break;
			}
			 else
			   flag = true;
		  }
		}
		return flag;
	}
}*/