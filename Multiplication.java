import java.util.Scanner;
public class Multiplication{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num1,num2;
System.out.print("Enter first number:");
num1=s.nextInt();
System.out.print("Enter second number:");
num2=s.nextInt();
System.out.print("Multiplication is:"+(num1*num2));
}
}