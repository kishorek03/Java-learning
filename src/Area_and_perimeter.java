import java.util.Scanner;
public class Area_and_perimeter{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the radius of the circle: ");
  double r=in.nextDouble();
  Double A=2*Math.PI*r;
  Double P=Math.PI*r*r;
  System.out.println("The Area Of circle is :"+A);
  System.out.println("The Perimeter Of circle is :"+P);
  
 }
}