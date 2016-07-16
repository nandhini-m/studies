
public class Sample1 {
	public static void main(String[] args) {
		
		int b=args.length;
		if(b==0)
		{
			System.out.println("The argument is needeed");
		}
		else
		{
			int a;
			a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println(a+" is a positive number");
		}
		else if(a<0)
		{
			System.out.println(a+" is a negative number");
		}
		else
		{
			System.out.println(a+" is neither positive nor negative");
		}
	}
	
	}
}
