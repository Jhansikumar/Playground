import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      
      int count=0;
        Scanner in =new Scanner(System.in);
     int n=in.nextInt();
      int m=n;
      while(m>=100)
      {
        m=m/10;
	}
      int n1=m%10;
      System.out.println(n1);
    }

}