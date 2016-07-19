import java.util.*;
public class multi {
	public static void main(String[] args) {
		Scanner in1=new Scanner(System.in);
		int a=in1.nextInt();
		Scanner in2=new Scanner(System.in);
		int b=in1.nextInt();
		int rem=0,diff=0;
		while(a>=b)
		{
			diff=a-b;
			a=diff;
			rem++;
		}
		System.out.println("quotient :"+rem+" rem:"+diff);
		}
	}

	  
