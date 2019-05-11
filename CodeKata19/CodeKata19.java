import java.util.*;
import java.io.*;
class CodeKata19{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
 for(int i=n-1;i>0;i--)
 {
	n*=i;
 }
System.out.print(n);
}
}