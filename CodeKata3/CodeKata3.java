import java.io.*;
import java.util.*;
import java.util.regex.*;
class CodeKata3{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char input = sc.next().charAt(0);
String c=Character.toString(input).toLowerCase();
System.out.println((Pattern.matches("[aeiou]", c))?"Vowel":((Pattern.matches("[a-z&&[^aeiou]]", c))?"Consonant":"Invalid"));
}
}