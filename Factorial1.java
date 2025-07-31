import java.util.Scanner;
public class Factorial1{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter any number:");
n=s.nextInt();
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("Factorial of a given number is:"+fact);
}
}