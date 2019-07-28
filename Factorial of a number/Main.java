import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in); 
      int n=in.nextInt();
    int  i=1,fact=1;
     while(i<=n)
     {
       fact=fact*i;
       i++;
	}
      System.out.println(fact);
}
}