import java.util.*;
import java.io.*;
class CodeKata16{
public static void main(String[] args)
{
int a,b,flag;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(int i=a+1;i<b;i++)
{
flag=1;
	for(int j=2;j<=i/2;j++)
	{
	if(i%j==0)
	{
	flag=0;//it is not prime
	}
	}
if(flag==1)
{
System.out.print(i+" ");
}
}
}
}