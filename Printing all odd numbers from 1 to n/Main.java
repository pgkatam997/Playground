import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      for(int i=1;i<=n;i++){
        if(i%2!=0)
        {
          System.out.println(i+"");
        }
      }
	}
}