import java.util.*;
public class Larger{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num_1,num_2;
System.out.println("Enter first number:");
num_1=s.nextInt();
System.out.println("Enter first number:");
num_2=s.nextInt();
if(num_1>num_2){
System.out.println("First number is larger that is:"+num_1);
}
else if(num_2>num_1){
System.out.println("Second number is larger that is:"+num_2);
}
else{
System.out.println("Equal numbers.");
}
}
}
