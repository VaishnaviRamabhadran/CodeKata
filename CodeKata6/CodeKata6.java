import java.util.*;
import java.io.*;
class CodeKata6{
public static void main(String[] args)
{
int year;
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
System.out.print((year%4==0)?"yes":"no");
}
}