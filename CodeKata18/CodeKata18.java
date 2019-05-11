import java.util.*;
import java.io.*;
class CodeKata18{
public static void main(String[] args)
{
int a,b,n,sum;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
 for(int i=a+1;i<b;i++)
 {
  n=i;
  sum=0;
  while(n!=0)
  {
  sum+=Math.pow(n%10,3);
  n=n/10;
  }
  if(i==sum)
  {
   System.out.print(sum+ " ");//prints list of armstrong
  }
 }
}
}