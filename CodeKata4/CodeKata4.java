import java.io.*;
import java.util.*;
import java.util.regex.*;
class CodeKata4{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char input = sc.next().charAt(0);
String c=Character.toString(input);
System.out.println((Pattern.matches("[A-z]", c))?"Alphabet":"No");
}
}