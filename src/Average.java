import java.util.Scanner;
public class Average{
	public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the first no: ");
	double a=in.nextDouble();
	System.out.println("Enter the second no: ");
	double b=in.nextDouble();
	System.out.println("Enter the third no: ");
	double c=in.nextDouble();
	double Average=(a+b+c)/3;
	System.out.println("Average of the given three numbers are : "+ Average);
}
}