import java.util.*;
public class fib {
	public static void main(String[] args) {
	int var1=0;
	int var2=1;
	int fib=0;
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	if(a==1)
	{
		System.out.println(0);
	}
	else if(a==2)
	{
		System.out.println(1);
	}
	else
	{
		for(int k=2;k<a;k++)
		{
			fib=var1+var2;
			var1=var2;
			var2=fib;
		}System.out.println(fib);
	}
	}

}
