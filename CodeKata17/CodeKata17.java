import java.util.*;
import java.io.*;
class CodeKata17{
public static void main(String[] args)
{
int n,num,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
num=n;
while(n!=0)
{
sum+=Math.pow(n%10,3);
n=n/10;
}
System.out.print((sum==num)?"yes":"no");
}
}