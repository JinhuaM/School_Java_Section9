package cn.edu.nju;

class AaaException extends Exception{}
class BbbException extends Exception{}

	class ThrowException{
		public static void main(String[] args){
			int x=1;
			try{
				if (x>0)
					throw new AaaException();
				else
					throw new BbbException();
			}
			catch(AaaException e){
				System.out.println("ִ��aaa�쳣�������");
			}
			catch(BbbException e){
				System.out.println("ִ��bbb�쳣�������");
			}
	}
}

