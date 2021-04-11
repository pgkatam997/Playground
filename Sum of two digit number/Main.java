import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner scan=new Scanner(System.in);
    int m,n, sum=0;
    m=scan.nextInt();
    while(m>0){
      n=m%10;
      sum=sum+n;
      m=m/10;
    }
    System.out.println(+sum);
  }
}