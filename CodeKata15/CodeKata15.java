import java.util.*;
import java.io.*;
class CodeKata15{
public static void main(String[] args)
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();

for(int i=a+1;i<b;i++)
{
	if(i%2==0)
	{
	System.out.print(i+" ");
	}

}
}
}