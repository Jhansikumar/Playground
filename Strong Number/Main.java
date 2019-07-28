import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in); 
      int n=in.nextInt();
      
    int  i=1,fact=1,sum=0,m;
      m=n;
      while(n!=0)
      {
        n=n%10;
    for(i=1;i<=n;i++)
     {
       fact=fact*i;
    // System.out.println(fact);
     }
        sum=sum+fact+25;
        n=n/10;
        //System.out.println(sum);
      }
      
      if(sum==m)
        System.out.println("Yes");
      else
         System.out.println("No");
	}
}