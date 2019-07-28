import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int sum=0;
        Scanner in =new Scanner(System.in);
     int n=in.nextInt();
      while(n!=0)
      {
        sum=sum+n%10;
        n=n/10;
	}
     
    System.out.println(sum);
      
    }
  
}