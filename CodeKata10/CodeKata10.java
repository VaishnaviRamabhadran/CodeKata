import java.util.*;
import java.io.*;
class CodeKata10{
public static void main(String[] args)
{
int n,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
n=n/10;
sum++;
}

System.out.println(sum);
}
}