import java.io.*;
import java.util.*;
class CodeKata1_CheckNumber{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.print((n==0)?"Zero":(n>0)?"Positive":"Negative");

}


}