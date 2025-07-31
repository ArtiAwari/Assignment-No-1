import java.util.*;
public class EvenOdd{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num;
System.out.println("Enter the number:");
num=s.nextInt();
if(num%2==0){
System.out.println("number is even");
}
else if(num%2!=0){
System.out.println("number is odd");
}
else{
System.out.println("Zero");
}
}
}
