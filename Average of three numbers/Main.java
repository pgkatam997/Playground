import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner scan=new Scanner(System.in);
    double n1=scan.nextDouble();
    double n2=scan.nextDouble();
    double n3=scan.nextDouble();
    System.out.println(+avr(n1,n2,n3));
  }
  public static double avr(double a,double b,double c){
    return (a+b+c)/3;
  }
}