package cn.edu.nju;

public class MethodException {
	static void m()throws Exception{
		int a=3;
		int b=0;
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	public static void main(String[] args){
		try{
			m();
		}
		catch(Exception e){
			System.out.println("��������쳣:"+e.getMessage());
			System.out.println("�������");
		}
	}
}
