import java.util.*;
public class Factorial{
public int fact(int n){
if(n<=1){
return 1;
}
else{
return n*fact(n-1);
}}
public static void main(String args[]){
int num;
Scanner s=new Scanner(System.in);
System.out.println("Enter any number:");
num=s.nextInt();
Factorial f=new Factorial();
System.out.println("Factorial of agiven number is:"+f.fact(num));
}
}