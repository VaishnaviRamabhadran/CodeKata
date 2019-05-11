import java.util.*;
import java.io.*;
class CodeKata9{
public static void main(String[] args)
{
int n,sum=0,size;
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
n=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
if(i<=n)
{
sum+=arr[i];
}
}
System.out.println(sum);
}
}