import java.util.*;
import java.io.*;
class CodeKata2{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.print((n>0)?((n%2==0)?"Even":"Odd"):"Invalid");
}
}