/*
������2��
��Ŀ���ж�101-200֮���ж��ٸ����������������������
	����1.�����������
		  2.�����������
	
	������
		���������ܱ�1�Լ���������������
	
		�㷨��
			int count==0;//�����ĸ���
			int number; //
			��2��ʼ������a/2
			for(int a =2; a < number/2;a++ ){
			if(number % a == 0){
				//��������
			}
			
*/
class Ex2{
	public static void main(String[] args){
		final int num_of = 10;
		int count = 0;//ͳ����������
		int number = 101;
		System.out.print("100-200֮�������Ϊ��");
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
			System.out.println("100-200֮�����������Ϊ:" + count);
		}
	}

	/*
	public static void main(String[] args){
		int m = 100;
		int n = 200;
		int count = 0;
		//ͳ����������
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
		System.out.println("��"+m+"��"+n+"֮�乲��"+count+"������");
		System.out.println(Math.sqrt(n));
	}
	//�ж�����
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