import java.io.*;
import java.util.*;
class CodeKata5{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.print((a>b)?(a>c?a:c):(b>c?b:c));
}
}