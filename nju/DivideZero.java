package cn.edu.nju;

public class DivideZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		try{
			y=3/x;
		}
		catch(Exception e){
			System.out.println("��������ʱ�����쳣");
		}
		System.out.println("�������");
	}

}
