import java.util.Scanner;
class Prime{
public static boolean isPrime(int num){
if(num<=1){
return false;
}
else{
for (int i=2;i<=Math.sqrt(num);i++){
if(num%i==0){
return false;
}
}
return true;
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num;
num=s.nextInt();
if(isPrime(num)){
System.out.println("Prime");
}
else{
System.out.println("Not prime");
}
}
}
