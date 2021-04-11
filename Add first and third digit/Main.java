import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int sum=0;
    sum=firstDigitSum(num);
    System.out.println(+sum);
  }
  public static int firstDigitSum(int num){
    int lastDigit,firstDigit,divisor;
    int totalDigit=0;
    int sum=0;
    lastDigit=num%10;
    totalDigit=findDigit(num);
    divisor=(int)Math.pow(10,totalDigit-1);
    firstDigit=num/divisor;
    sum=firstDigit+lastDigit;
    return sum;
  }
  public static int findDigit(int num){
    int count=0;
    while(num!=0)
    {
      count++;
      num=num/10;
    }
    return count;
  }
}