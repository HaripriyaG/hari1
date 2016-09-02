# hari1
import java.util.*;
class Palindrome
{
public static void main(String [] arg)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int sum=0;
while(a>0)
{
int b=a%10;
sum=sum+b;
a=a/10;
}
String c=String.valueOf(sum);
StringBuffer b1=new StringBuffer(c);
String ans=b1.reverse().toString();
if(c.equals(ans))
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}
