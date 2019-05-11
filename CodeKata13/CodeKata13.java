import java.util.*;
import java.io.*;
class CodeKata13{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=2;i<=n/2;i++)
{
	if(n%i==0)
	{
	System.out.print("no");
	break;
	}
	else
	{
	System.out.print("yes");
	break;
	}
}
}
}