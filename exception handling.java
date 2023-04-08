/*//exception handling
class Error3{
		public static void main(String[]args){
				int a=10;
				int b=5;
				int c=5;
				int x,y;
				try{
					x=a/(b-c);	//exception here
				}
					
					  catch(ArithmeticException e){
							System.out.println("division by zero");
					       }
						   y=a/(b+ c);
}*/
/*//catching invalid command line argument
public class CLineInput{
	public static void main(String[]args){
		int invalid =0;
		int number,count=0;
		for (int i=0;i<args.length;i++){
			try{
				number=Integer.parseInt(args[i]);//parseint is used for integer to string
			}
			catch(NumberFormatException e){
				 invalid =invalid +1;
				 System.out.println("Invalid number1: "+args[i]);
				 continue;
				}
			count=count+1;
		}
		System.out.println("valid numbers ="+count);
		System.out.println("invalid numubers ="+invalid );
	}
} */
class Error4{
	public static void main(String[]args){
		int a[]={5,10};
		int b=5;
		
		try{
			int x=a[2]/b-a[1];
		}
		catch(ArithmeticException e){
			System.out.println("division by zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index error");
		}
		catch(ArrayStoreException e){
			System.out.println("wrong data type");
		}
		int y=a[1]/a[0];
		System.out.println("y="+y);
	}	
}
