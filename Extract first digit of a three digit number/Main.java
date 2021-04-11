import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    System.out.println(firstDigit(n)+"");
  }
  public static int firstDigit(int n){
    while(n>=10)
    n/=10;
    return n;
  }
}