package cn.edu.nju;

public class ManyException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[]={1,2,3,4};
		for(i=0;i<5;i++){
			try{
				System.out.print("a["+i+"]/"+i+"="+(a[i]/i));
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.print("�����������±�Խ���쳣");
			}
			catch(ArithmeticException e){
				System.out.print("�쳣�������ǣ�"+e);
			}
			catch(Exception e){
				System.out.print("����"+e.getMessage()+"�쳣!");
			}
			finally{
				System.out.println("   finally i="+i);
			}
		}
		System.out.println("����!");
	}

}
