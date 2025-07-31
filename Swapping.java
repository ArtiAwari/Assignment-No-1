import java.util.*;
public class Swapping{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a,b;
a=s.nextInt();
b=s.nextInt();
System.out.println("Before swapping value of a="+a+" value of b="+b);
b=a+b;
a=b-a;
b=b-a;
System.out.println("After swapping value of a="+a+" value of b="+b);
}
}