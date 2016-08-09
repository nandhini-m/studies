import java.util.Scanner;

class stringdup{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char ch[]=s.toCharArray();
		int len=ch.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++)
			{
			if(ch[i]==ch[j])
			{
				ch[i]='#';
			}
		}
		}
	for(int j=len-1;j>0;j--)
	{
				if(ch[j]!='#')
				{
				System.out.println(ch[j]);
		}
}
	
	}
}
