import java.util.*;
import java.io.*;
class CodeKata12{
public static void main(String[] args)
{
int n,sum=0,num;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
num=n;
while(n!=0)
{
sum=sum*10+(n%10);
n=n/10;
}
System.out.println((sum==num)?"yes":"no");
}
}