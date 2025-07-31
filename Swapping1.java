import java.util.Scanner;
public class Swapping1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1,num2,temp;
System.out.print("Enter first number:\n");
num1=sc.nextInt();
System.out.print("Enter second number:\n");
num2=sc.nextInt();
temp=num1;
num1=num2;
num2=temp;
System.out.print("num1="+num1+" num2="+num2);
}
}