import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get n value from the user
	    int n = in.nextInt();
	    int count = 1;
		while(count <= n)
		{
		    System.out.println("I am a Java Developer");
		    count = count + 1;
		}
	}
}