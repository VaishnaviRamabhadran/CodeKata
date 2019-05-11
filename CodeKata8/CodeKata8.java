import java.util.*;
import java.io.*;
class CodeKata8{
public static void main(String[] args)
{
int n,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<=n;i++)
{sum+=i;}
System.out.println(sum);
}
}