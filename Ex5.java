/*
	������5��
	��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��
	60-89��֮�����B��ʾ��60�����µ���C��ʾ��

*/
public class Ex5{
	public static void main(String[] args){
		int n = -1;
		try{
			n = Integer.parseInt(args[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("������ɼ�");
			return;
		}
		grade(n);
	}
		private static void grade(int n ){
			if(n>100||n<0)
				System.out.println("������Ч");
			else{
				String str = (n>=90)?"�֣�����A��":((n>60))?"�֣�����B��":"�֣�����C��";
				System.out.println(n+str);
			}
		}
	
	}
}