import java.util.Scanner;

public class reversestringgg {
	public static void main(String[] args) {
		
Scanner in=new Scanner(System.in);
System.out.println("enter a string:");
String s=in.next();
StringBuffer sb=new StringBuffer(s);
sb.reverse();
System.out.println("reversed string is "+sb );
	}
}
