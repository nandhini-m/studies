import java.util.Scanner;
public class lo {
	
  

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			java.lang.String s1=input.nextLine();
			java.lang.String s2=input.nextLine();
			//java.lang.String ch[]=s1.split(" ");
			if(s1.contains(s2))
			{
				String ch[]=s1.split(" ");
				int count=s1.indexOf(s2);
				System.out.println(count);
				
			}
			else
			{
				System.out.println("it does not contain's the substring");
			}
			

		}

	}
